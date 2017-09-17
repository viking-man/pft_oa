package oa.user.employee.service;

import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.employee.dao.UserDao;
import oa.user.employee.entity.UserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import param.GlobleConstant;

import javax.annotation.Resource;

/**
 * Created by jiang on 2017/9/8.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private UserDao userDao;

    public boolean login(String userno, String password, Model model) {

        UserEntity user = userDao.selectByUserno(userno);
        if (user != null) {
            if (StringUtils.equals(user.getPwd(), password)) {

                LoginTokenContextHolder.addToken(GlobleConstant.SESSION_LOGIN_CONTEXT, new LoginTokenContext(user));
                return true;
            }
        } else {
            LoginTokenContextHolder.clear();
        }
        return false;
    }

}
