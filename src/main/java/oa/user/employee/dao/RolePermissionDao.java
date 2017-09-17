package oa.user.employee.dao;

import oa.user.employee.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RolePermissionDao {
    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);
}