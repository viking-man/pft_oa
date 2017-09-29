package oa.user.user.service;

import common.error.BasicException;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.permission.dao.RolePermissionDao;
import oa.user.permission.entity.RolePermissionEntity;
import oa.user.role.dao.RoleDao;
import oa.user.role.entity.RoleEntity;
import oa.user.user.dao.UserDao;
import oa.user.user.entity.UserEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import param.GlobleConstant;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiang on 2017/9/8.
 */
@Service
public class LoginServiceImpl implements ILoginService {

    @Resource
    private UserDao userDao;

    @Resource
    private RoleDao roleDao;

    @Resource
    private RolePermissionDao rolePermissionDao;

    public LoginTokenContext login(String userno, String password) throws BasicException {

        UserEntity user = userDao.selectByUserno(userno);
        if (user == null) {
            LoginTokenContextHolder.clear();
            throw new BasicException("用户名不存在，请联系管理员");
        }

        if (StringUtils.equals(user.getPwd(), password)) {

            LoginTokenContext loginTokenContext = new LoginTokenContext(user);
            RoleEntity roleEntity = roleDao.selectByUserid(user.getId());
            if (roleEntity != null) {
                List<RolePermissionEntity> rolePermissionEntities = rolePermissionDao.queryByRoleid(roleEntity.getId());
                loginTokenContext.setRoleid(roleEntity.getId());

                List<String> permissions = new ArrayList<>();
                for (RolePermissionEntity rolePermissionEntity : rolePermissionEntities) {
                    permissions.add(rolePermissionEntity.getPermission());
                }
                loginTokenContext.setRolePermissions(permissions);
            }

            LoginTokenContextHolder.addToken(GlobleConstant.SESSION_LOGIN_CONTEXT, loginTokenContext);
            return loginTokenContext;
        } else {
            LoginTokenContextHolder.clear();
            throw new BasicException("用户名和密码不匹配，请联系管理员");
        }
    }

}
