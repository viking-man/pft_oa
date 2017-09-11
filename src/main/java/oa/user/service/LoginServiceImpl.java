package oa.user.service;

import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.dao.UserEntityMapper;
import oa.user.entity.UserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import param.GlobleConstant;

import javax.annotation.Resource;
import javax.security.auth.login.LoginContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by jiang on 2017/9/8.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private UserEntityMapper userEntityMapper;

    public boolean checkLoginState(HttpServletRequest request, Model model) {

        String userno = request.getParameter("userno");
        String password = request.getParameter("password");

        UserEntity user = userEntityMapper.selectByUserno(userno);
        if (user != null) {
            if (StringUtils.equals(user.getPwd(), password)) {
                request.getSession().setAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT, new LoginTokenContext(user));
                model.addAttribute("user", user);
                return true;
            }
        } else {
            request.getSession().invalidate();
        }
        return false;
    }
}
