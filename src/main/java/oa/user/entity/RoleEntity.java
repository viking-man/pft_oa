package oa.user.entity;

import java.util.Date;

public class RoleEntity {
    private Long id;

    private Long rowstamp;

    private Long createuser;

    private Date createtime;

    private Long modifyuser;

    private Date modifytime;

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

    public Long getRowstamp() {
        return rowstamp;
    }

    public void setRowstamp(Long rowstamp) {
        this.rowstamp = rowstamp;
    }

    public Long getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Long createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Long modifyuser) {
        this.modifyuser = modifyuser;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
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