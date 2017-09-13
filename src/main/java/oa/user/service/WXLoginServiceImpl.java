package oa.user.service;

import com.alibaba.fastjson.JSON;
import context.LoginTokenContext;
import oa.user.dao.UserEntityMapper;
import oa.user.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import param.GlobleConstant;
import param.HttpConst;
import util.HttpsUtil;
import weixin.entity.AccessTokenEntity;
import weixin.WXTokenUtil;
import weixin.entity.UseridEntity;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
@Service
public class WXLoginServiceImpl implements WXLoginService {

    @Resource
    private UserEntityMapper userEntityMapper;

    public boolean checkLoginState(HttpServletRequest request, Model model) {
        String code = request.getParameter("code");
        AccessTokenEntity accesstoken = WXTokenUtil.getAccesstoken(GlobleConstant.WEIXIN_CorpID, GlobleConstant.WEIXIN_Secret);
        if (accesstoken == null || accesstoken.getErrcode() == 40029) {
            model.addAttribute("error", "获取Access_Token时出错");
            return false;
        }

        UseridEntity useridEntity = WXTokenUtil.getUserid(accesstoken.getAccess_token(), code);
        if (useridEntity == null || useridEntity.getErrcode() == 40029) {
            model.addAttribute("error", "获取UserId时出错");
            return false;
        }

        UserEntity user = userEntityMapper.selectByWxuserid(useridEntity.getUserId());
        if (user == null) {
            model.addAttribute("error", String.format("未通过微信userid(%s)查询到用户", useridEntity.getUserId()));
            return false;
        }

        request.getSession().setAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT, new LoginTokenContext(user));

        return true;
    }
}
