package oa.user.user.entity;

import common.entity.EntityHasRcm;

public class UserroleEntity extends EntityHasRcm {

    private Long userid;

    private Long roleid;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getRoleid() {
        return roleid;
    }

    public void setRoleid(Long roleid) {
        this.roleid = roleid;
    }

}