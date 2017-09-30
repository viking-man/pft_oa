package oa.user.user.entity;

import common.entity.EntityHasRcm;

public class UserDepartmentEntity extends EntityHasRcm {

    private Long userid;

    private Long departmentid;

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