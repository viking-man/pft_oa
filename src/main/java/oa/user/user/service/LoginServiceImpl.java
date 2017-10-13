package oa.user.user.service;

import common.error.BasicException;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.department.dao.DepartmentDao;
import oa.department.entity.DepartmentEntity;
import oa.user.permission.dao.DepartmentPermissionDao;
import oa.user.permission.dao.RolePermissionDao;
import oa.user.permission.entity.DepartmentPermissionEntity;
import oa.user.permission.entity.RolePermissionEntity;
import oa.user.role.dao.RoleDao;
import oa.user.role.entity.RoleEntity;
import oa.user.user.dao.UserDao;
import oa.user.user.dao.UserDepartmentDao;
import oa.user.user.dao.UserroleDao;
import oa.user.user.entity.UserDepartmentEntity;
import oa.user.user.entity.UserEntity;
import oa.user.user.entity.UserroleEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import param.GlobleConstant;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
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

    @Resource
    private DepartmentDao departmentDao;

    @Resource
    private DepartmentPermissionDao departmentPermissionDao;

    public LoginTokenContext login(String userno, String password, HttpServletRequest request) throws BasicException {

        UserEntity user = userDao.selectByUserno(userno);
        if (user == null) {
            LoginTokenContextHolder.clear();
            throw new BasicException("用户名不存在，请联系管理员");
        }

        if (StringUtils.equals(user.getPwd(), password)) {

            LoginTokenContext loginTokenContext = new LoginTokenContext(user);
            List<String> permissions = new ArrayList<>();

            //获取角色权限
            getRolePermissions(user, loginTokenContext, permissions);

            //获取部门权限
            getDepartmentPermissions(user, loginTokenContext, permissions);

            loginTokenContext.setRolePermissionUrls(permissions);
            LoginTokenContextHolder.addToken(GlobleConstant.SESSION_LOGIN_CONTEXT, loginTokenContext);
            return loginTokenContext;
        } else {
            LoginTokenContextHolder.clear();
            throw new BasicException("用户名和密码不匹配，请联系管理员");
        }
    }

    private void getDepartmentPermissions(UserEntity user, LoginTokenContext loginTokenContext, List<String> permissions) {
        DepartmentEntity departmentEntity = departmentDao.selectByUserid(user.getId());
        if (departmentEntity != null) {
            List<DepartmentPermissionEntity> departmentPermissions = departmentPermissionDao.queryByDepartmentid(departmentEntity.getId());

            loginTokenContext.setDepartmentno(departmentEntity.getDepartmentno());
            for (DepartmentPermissionEntity departmentPermissionEntity : departmentPermissions) {
                permissions.add(departmentPermissionEntity.getUrl());
            }
        }
    }

    private void getRolePermissions(UserEntity user, LoginTokenContext loginTokenContext, List<String> permissions) {
        RoleEntity roleEntity = roleDao.selectByUserid(user.getId());
        if (roleEntity != null) {
            List<RolePermissionEntity> rolePermissionEntities = rolePermissionDao.queryByRoleid(roleEntity.getId());
            loginTokenContext.setRolecode(roleEntity.getRolecode());
            for (RolePermissionEntity rolePermissionEntity : rolePermissionEntities) {
                permissions.add(rolePermissionEntity.getUrl());
            }

        }
    }

}
