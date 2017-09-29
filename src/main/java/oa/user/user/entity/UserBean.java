package oa.user.user.entity;

import oa.department.entity.DepartmentEntity;
import oa.user.role.entity.RoleEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-16:27
 */
public class UserBean {

    private UserEntity user;

    private RoleEntity role;

    private DepartmentEntity department;

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

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
}
