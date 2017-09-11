package oa.user.dao;

import oa.user.entity.RolePermissionEntity;

public interface RolePermissionEntityMapper {
    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);
}