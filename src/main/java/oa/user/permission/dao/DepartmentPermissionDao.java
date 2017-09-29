package oa.user.permission.dao;

import oa.department.entity.DepartmentEntity;
import oa.user.permission.entity.DepartmentPermissionEntity;
import oa.user.permission.entity.RolePermissionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentPermissionDao {

    List<DepartmentPermissionEntity> queryAll();

    int insertSelective(DepartmentPermissionEntity record);

    List<DepartmentPermissionEntity> queryByDepartmentid(Long roleid);

    int batchInsert(List<DepartmentPermissionEntity> departmentPermissions);

    int deleteDepartmentPermissions(Long departmentid);
}