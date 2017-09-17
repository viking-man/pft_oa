package oa.user.department.entity;

import java.util.Date;

public class DepartmentEntity {
    private Long id;

    private Long rowstamp;

    private Long createuser;

    private Date createtime;

    private Long modifyuser;

    private Date modifytime;

    private String departmentno;

    private String departmentname;

    private String departmentalias;

    private String remark;

    private Byte fixed;

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

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno == null ? null : departmentno.trim();
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname == null ? null : departmentname.trim();
    }

    public String getDepartmentalias() {
        return departmentalias;
    }

    public void setDepartmentalias(String departmentalias) {
        this.departmentalias = departmentalias == null ? null : departmentalias.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Byte getFixed() {
        return fixed;
    }

    public void setFixed(Byte fixed) {
        this.fixed = fixed;
    }
}