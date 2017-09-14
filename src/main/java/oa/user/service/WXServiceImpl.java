package oa.user.service;

import common.error.BasicException;
import common.error.ErrorConst;
import context.LoginTokenContext;
import oa.user.dao.UserEntityMapper;
import oa.user.dao.WxBindEntityMapper;
import oa.user.entity.UserEntity;
import oa.user.entity.WxBindEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import param.GlobleConstant;
import util.HttpsUtil;
import weixin.entity.AccessTokenEntity;
import weixin.WXTokenUtil;
import weixin.entity.UseridEntity;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
@Service
public class WXServiceImpl implements WXService {

    @Resource
    private UserEntityMapper userEntityMapper;

    @Resource
    private WxBindEntityMapper wxBindEntityMapper;

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

            UserEntity user = userEntityMapper.selectByWxuserid(wxuser.getUserId());
            if (user == null) {
                model.addAttribute("error", String.format("未通过微信userid(%s)查询到用户", wxuser.getUserId()));
                return false;
            }

            request.getSession().setAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT, new LoginTokenContext(user));
            model.addAttribute("user", user);
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
    public boolean wxBind(LoginTokenContext tokenContext, String code, Model model) {
        UserEntity user = userEntityMapper.selectByPrimaryKey(tokenContext.getUserid());
        if (user == null) {
            model.addAttribute(ErrorConst.ERROR, String.format("未查找到ID为%s的用户", tokenContext.getUserid()));
            return false;
        }

        try {
            UseridEntity wxuser = getWxuser(code);

            user.setWxuserid(wxuser.getUserId());
            user.actionBeforUpdate(tokenContext.getUserid());
            int updateUser = userEntityMapper.updateByPrimaryKeySelective(user);
            if (updateUser == 0) {
                model.addAttribute(ErrorConst.ERROR, "更新用户信息时出错");
                return false;
            }

            WxBindEntity wxBindEntity = new WxBindEntity();
            wxBindEntity.actionBeforeInsert(tokenContext.getUserid());
            wxBindEntity.setWxuserid(wxuser.getUserId());
            wxBindEntity.setUserid(user.getId());
            wxBindEntity.setUserno(user.getUserno());
            wxBindEntity.setUsername(user.getUsername());
            wxBindEntity.setDeviceid(wxuser.getDeviceId());
            wxBindEntity.actionBeforeInsert(tokenContext.getUserid());
            int insertWxbind = wxBindEntityMapper.insert(wxBindEntity);
            if (insertWxbind == 0) {
                model.addAttribute(ErrorConst.ERROR, "更新用户信息时出错");
                return false;
            }

            model.addAttribute("user", user);
        } catch (BasicException e) {
            model.addAttribute(ErrorConst.ERROR, e.getMessage());
            return false;
        }

        return true;
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
