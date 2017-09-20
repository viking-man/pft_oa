package oa.user.role.entity;

import common.entity.EntityHasRcm;

public class RoleEntity extends EntityHasRcm {
    private Long id;

    private String rolecode;

    private String rolename;

    private String rolealias;

    private String remark;

    private int fixed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode == null ? null : rolecode.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getRolealias() {
        return rolealias;
    }

    public void setRolealias(String rolealias) {
        this.rolealias = rolealias == null ? null : rolealias.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public int getFixed() {
        return fixed;
    }

    public void setFixed(int fixed) {
        this.fixed = fixed;
    }
}