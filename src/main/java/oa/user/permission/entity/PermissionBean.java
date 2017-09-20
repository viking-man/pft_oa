package oa.user.permission.entity;

import oa.department.entity.DepartmentEntity;
import oa.user.role.entity.RoleEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-17:09
 */
public class PermissionBean {

    private RoleEntity role;

    private DepartmentEntity department;

    private List<PermissionEntity> permissions = new ArrayList<>();

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
        this.role = role;
    }

    public DepartmentEntity getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentEntity department) {
        this.department = department;
    }

    public List<PermissionEntity> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PermissionEntity> permissions) {
        this.permissions = permissions;
    }
}
