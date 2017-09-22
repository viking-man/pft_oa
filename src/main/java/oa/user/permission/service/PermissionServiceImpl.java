package oa.user.permission.service;

import common.error.BasicException;
import common.service.BaseServiceImpl;
import oa.user.permission.dao.PermissionDao;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;
import oa.user.role.dao.RoleDao;
import oa.user.permission.dao.RolePermissionDao;
import oa.user.role.entity.RoleEntity;
import oa.user.permission.entity.RolePermissionEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-16:17
 */
@Service
public class PermissionServiceImpl extends BaseServiceImpl<PermissionEntity, PermissionDao> implements PermissionService {

    @Resource
    private RolePermissionDao rolePermissionDao;

    @Resource
    private PermissionDao dao;

    @Resource
    private RoleDao roleDao;

    @Override
    protected PermissionDao getBaseDao() {
        return dao;
    }

    @Override
    public PermissionBean readRolePermission(Long roleid) throws BasicException {
        RoleEntity role = roleDao.select(roleid);

        List<RolePermissionEntity> rolePermissions = new ArrayList<>();
        if (roleid == null) {
            rolePermissions = rolePermissionDao.queryAll();
        } else {
            rolePermissions = rolePermissionDao.queryByRoleid(roleid);
        }
        if (CollectionUtils.isEmpty(rolePermissions))
            throw new BasicException(String.format("该角色(%s)无权限项", role.getRolename()));

        List<String> permissionsName = new ArrayList<>();
        for (RolePermissionEntity rolePermission : rolePermissions) {
            permissionsName.add(rolePermission.getPermission());
        }
        List<PermissionEntity> permissions = dao.batchQuery(permissionsName);

        PermissionBean permissionBean = new PermissionBean();
        permissionBean.getPermissions().addAll(permissions);
        permissionBean.setRole(role);
        return permissionBean;
    }

    @Override
    public List<PermissionEntity> queryRolePermission(String rolecode) throws BasicException {
        RoleEntity roleEntity = roleDao.selectByUserno(rolecode);
        if (roleEntity == null)
            throw new BasicException("没有有效角色定义");

        List<RolePermissionEntity> rolePermissions = rolePermissionDao.queryByRoleid(roleEntity.getId());
        if (CollectionUtils.isEmpty(rolePermissions))
            throw new BasicException(String.format("该角色(%s)无权限项", roleEntity.getRolename()));

        List<String> permissionsName = new ArrayList<>();
        for (RolePermissionEntity rolePermission : rolePermissions) {
            permissionsName.add(rolePermission.getPermission());
        }

        return dao.batchQuery(permissionsName);
    }

}
