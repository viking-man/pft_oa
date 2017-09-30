package oa.department.entity;

import common.entity.EntityHasRcm;


public class DepartmentEntity extends EntityHasRcm {

    private String departmentno;

    private String departmentname;

    private String departmentalias;

    private String remark;

    private Byte fixed;

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