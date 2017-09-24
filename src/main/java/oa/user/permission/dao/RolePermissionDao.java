package oa.user.permission.dao;

import common.dao.BaseDao;
import oa.user.permission.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RolePermissionDao {

    List<RolePermissionEntity> queryAll();

    int insertSelective(RolePermissionEntity record);

    List<RolePermissionEntity> queryByRoleid(Long roleid);

    int batchInsert(List<RolePermissionEntity> rolePermissions);

    int deleteRolePermissions(Long roleid);
}