package oa.user.permission.service;

import common.error.BasicException;
import common.service.BaseServiceImpl;
import oa.department.dao.DepartmentDao;
import oa.department.entity.DepartmentEntity;
import oa.user.permission.dao.DepartmentPermissionDao;
import oa.user.permission.dao.PermissionDao;
import oa.user.permission.entity.DepartmentPermissionEntity;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;
import oa.user.role.dao.RoleDao;
import oa.user.permission.dao.RolePermissionDao;
import oa.user.role.entity.RoleEntity;
import oa.user.permission.entity.RolePermissionEntity;
import org.springframework.stereotype.Service;
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

    @Resource
    private DepartmentPermissionDao departmentPermissionDao;

    @Resource
    private DepartmentDao departmentDao;

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
        RoleEntity roleEntity = roleDao.selectByRolecode(rolecode);
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

    @Override
    public List<PermissionEntity> queryDepartmentPermission(String departmentno) throws BasicException {

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        if (departmentEntity == null)
            throw new BasicException("没有有效部门定义");

        List<DepartmentPermissionEntity> departmentPermissions = departmentPermissionDao.queryByDepartmentid(departmentEntity.getId());
        if (CollectionUtils.isEmpty(departmentPermissions))
            throw new BasicException(String.format("该部门(%s)无权限项", departmentEntity.getDepartmentno()));

        List<String> permissionsName = new ArrayList<>();
        for (DepartmentPermissionEntity departmentPermission : departmentPermissions) {
            permissionsName.add(departmentPermission.getPermission());
        }

        return dao.batchQuery(permissionsName);
    }

    @Override
    public void distributeRolePermissions(Long[] permissionIds, String rolecode) throws BasicException {

        RoleEntity roleEntity = roleDao.selectByRolecode(rolecode);
        if (roleEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的角色", rolecode));

        List<Long> idsList = CollectionUtils.arrayToList(permissionIds);

        List<PermissionEntity> permissions = dao.batchQueryByIds(idsList);

        checkPermissionCount(idsList, permissions);

        rolePermissionDao.deleteRolePermissions(roleEntity.getId());

        List<RolePermissionEntity> rolePermissions = new ArrayList<>();
        for (PermissionEntity permission : permissions) {
            RolePermissionEntity rolePermissionEntity = new RolePermissionEntity();
            rolePermissionEntity.setPermission(permission.getPermission());
            rolePermissionEntity.setRoleid(roleEntity.getId());
            rolePermissionEntity.setUrl(permission.getUrl());
            rolePermissions.add(rolePermissionEntity);
        }
        rolePermissionDao.batchInsert(rolePermissions);

    }

    @Override
    public void distributeDepartmentPermissions(Long[] permissionIds, String departmentno) throws BasicException {

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        if (departmentEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的部门", departmentno));

        List<Long> idsList = CollectionUtils.arrayToList(permissionIds);

        List<PermissionEntity> permissions = dao.batchQueryByIds(idsList);

        checkPermissionCount(idsList, permissions);

        departmentPermissionDao.deleteDepartmentPermissions(departmentEntity.getId());

        List<DepartmentPermissionEntity> departmentPermissions = new ArrayList<>();
        for (PermissionEntity permission : permissions) {
            DepartmentPermissionEntity departmentPermissionEntity = new DepartmentPermissionEntity();
            departmentPermissionEntity.setPermission(permission.getPermission());
            departmentPermissionEntity.setDepartmentid(departmentEntity.getId());
            departmentPermissionEntity.setUrl(permission.getUrl());
            departmentPermissions.add(departmentPermissionEntity);
        }
        departmentPermissionDao.batchInsert(departmentPermissions);

    }

    private void checkPermissionCount(List<Long> idsList, List<PermissionEntity> permissions) throws BasicException {
        List<Long> idsFromDb = new ArrayList<>();
        permissions.forEach(permissionEntity -> {
            idsFromDb.add(permissionEntity.getId());
        });

        for (Long id : idsList) {
            if (idsFromDb.contains(id))
                idsFromDb.remove(id);
        }

        if (idsFromDb.size() != 0) {
            StringBuilder sb = new StringBuilder();
            for (Long id : idsFromDb) {
                sb.append(id).append(",");
            }
            throw new BasicException(String.format("不存在这些ID(%s)对应的权限项", sb.substring(0, sb.length() - 1).toString()));
        }
    }

}
