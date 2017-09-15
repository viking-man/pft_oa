package oa.user.entity;

import common.entity.EntityHasRcm;

import java.util.Date;

public class UserDepartmentEntity extends EntityHasRcm {
    private Long id;

    private Long userid;

    private Long departmentid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Long departmentid) {
        this.departmentid = departmentid;
    }
}