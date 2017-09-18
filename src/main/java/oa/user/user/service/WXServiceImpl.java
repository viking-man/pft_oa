package oa.user.user.service;

import common.error.BasicException;
import common.error.ErrorConst;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import context.WeixinContext;
import context.WeixinContextHolder;
import oa.user.user.dao.UserDao;
import oa.user.user.dao.WxBindDao;
import oa.user.user.entity.UserEntity;
import oa.user.user.entity.WxBindEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.util.CollectionUtils;
import param.GlobleConstant;
import weixin.entity.AccessTokenEntity;
import weixin.WXTokenUtil;
import weixin.entity.UseridEntity;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
@Service
public class WXServiceImpl implements WXService {

    @Resource
    private UserDao userDao;

    @Resource
    private WxBindDao wxBindDao;

    /**
     * 微信登录时验证
     *
     * @param request
     * @param model
     * @return
     */
    public boolean wxLogin(HttpServletRequest request, Model model) {
        String code = request.getParameter("code");

        try {
            UseridEntity wxuser = getWxuser(code);

            UserEntity user = userDao.selectByWxuserid(wxuser.getUserId());
            if (user == null) {
                model.addAttribute("error", String.format("未通过微信userid(%s)查询到用户", wxuser.getUserId()));
                return false;
            }

            LoginTokenContextHolder.addToken(GlobleConstant.SESSION_LOGIN_CONTEXT, new LoginTokenContext(user));
        } catch (BasicException e) {
            model.addAttribute(ErrorConst.ERROR, e.getMessage());
            return false;
        }

        return true;
    }

    /**
     * 微信绑定时验证
     *
     * @param tokenContext
     * @param code
     * @param model
     * @return
     */
    @Transactional
    public boolean wxBind( WeixinContext tokenContext, String code, Model model) {
        UserEntity user = userDao.selectByPrimaryKey(tokenContext.getUserid());
//        if (user == null) {
//            model.addAttribute(ErrorConst.ERROR, String.format("未查找到ID为%s的用户", tokenContext.getUserid()));
//            return false;
//        }
//        if (user.getWxuserid() != null) {
//            model.addAttribute(ErrorConst.ERROR, String.format("当前用户(%s)已经绑定了ID为[%s]的微信号", user.getUsername(), user.getWxuserid()));
//            return false;
//        }

        try {
            UseridEntity wxuser = getWxuser(code);
            List<UserEntity> users = userDao.queryByWxuserid(wxuser.getUserId());
            if (!CollectionUtils.isEmpty(users)) {
                StringBuilder sb = new StringBuilder();
                for (UserEntity userEntity : users) {
                    sb.append(userEntity.getUsername() + ",");
                }
                throw new BasicException(String.format("当前微信号[%s]已经绑定了名字为[%s]的账号", wxuser.getUserId(), sb.substring(0, sb.length() - 1).toString()));
            }


            user.setWxuserid(wxuser.getUserId());
            user.actionBeforUpdate();
            int updateUser = userDao.updateByPrimaryKeySelective(user);
            if (updateUser == 0) {
                throw new BasicException("更新用户信息时出错");
            }

            WxBindEntity wxBindEntity = new WxBindEntity();
            wxBindEntity.actionBeforeInsert();
            wxBindEntity.setWxuserid(wxuser.getUserId());
            wxBindEntity.setUserid(user.getId());
            wxBindEntity.setUserno(user.getUserno());
            wxBindEntity.setUsername(user.getUsername());
            wxBindEntity.setDeviceid(wxuser.getDeviceId());
            int insertWxbind = wxBindDao.insert(wxBindEntity);
            if (insertWxbind == 0) {
                throw new BasicException("插入用户绑定信息时出错");
            }

        } catch (BasicException e) {
            model.addAttribute(ErrorConst.ERROR, e.getMessage());
            return false;
        }

        return true;
    }

    @Transactional
    public boolean removeWxBind(Long id) throws BasicException {
        UserEntity user = userDao.selectByPrimaryKey(id);
        if (user == null)
            throw new BasicException(String.format("未查询到ID为[%s]的用户", id));
        if (StringUtils.isBlank(user.getWxuserid()))
            throw new BasicException(String.format("ID为[%s]的用户当前没有绑定微信号", id, user.getWxuserid()));

        if (wxBindDao.deleteByUseridAndWxuserid(user.getId(), user.getWxuserid()) == 0)
            return false;

        user.setWxuserid(null);
        user.actionBeforUpdate();
        if (userDao.updateByPrimaryKey(user) == 0)
            return false;

        return true;
    }

    public void requestToWeixinForBind(Long id, HttpServletResponse response) throws BasicException, IOException {
        UserEntity user = userDao.selectByPrimaryKey(id);
        if (user == null)
            throw new BasicException(String.format("未查询到ID为[%s]的用户", id));
        if (StringUtils.isNotBlank(user.getWxuserid()))
            throw new BasicException(String.format("ID为[%s]的用户已经绑定号码为[%s]的微信", id, user.getWxuserid()));

        WeixinContextHolder.addToken(GlobleConstant.WEIXIN_BINDUSER_KEY, new WeixinContext(user, GlobleConstant.WEIXIN_BIND));


        response.sendRedirect("https://open.work.weixin.qq.com/wwopen/sso/qrConnect?appid=wx5ba8760d25c0e797&agentid=1000002&redirect_uri=http%3A%2F%2F122.224.220.182:8082&state=usWmsYx");
    }

    private UseridEntity getWxuser(String code) throws BasicException {
        AccessTokenEntity accesstoken = WXTokenUtil.getAccesstoken(GlobleConstant.WEIXIN_CorpID, GlobleConstant.WEIXIN_Secret);

        if (accesstoken == null || accesstoken.getErrcode().intValue() != 0) {
            throw new BasicException("获取access_token时出错");
        }

        UseridEntity useridEntity = WXTokenUtil.getUserid(accesstoken.getAccess_token(), code);
        if (useridEntity == null || useridEntity.getErrcode().intValue() != 0) {
            throw new BasicException("获取wx_userid时出错");
        }

        return useridEntity;
    }
}
