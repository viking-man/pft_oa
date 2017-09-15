package oa.user.dao;

import oa.user.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionEntityMapper {
    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);
}