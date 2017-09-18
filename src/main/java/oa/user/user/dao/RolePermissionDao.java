package oa.user.user.dao;

import oa.user.user.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionDao {
    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);
}