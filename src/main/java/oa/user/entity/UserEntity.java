package oa.user.entity;

import java.util.Date;

public class UserEntity {
    private Long id;

    private Long rowstamp;

    private Long createuser;

    private Date createtime;

    private Long modifyuser;

    private Date modifytime;

    private String username;

    private String userno;

    private String sex;

    private String pwd;

    private String addr;

    private String phoneno;

    private String mobileno;

    private String email;

    private Byte noallowed;

    private Byte suspended;

    private String department;

    private String remark;

    private String wxuserid;

    private String otuserid;

    private String reserve1;

    private String reserve2;

    private String reserve3;

    private String externid;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno == null ? null : userno.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno == null ? null : mobileno.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Byte getNoallowed() {
        return noallowed;
    }

    public void setNoallowed(Byte noallowed) {
        this.noallowed = noallowed;
    }

    public Byte getSuspended() {
        return suspended;
    }

    public void setSuspended(Byte suspended) {
        this.suspended = suspended;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getWxuserid() {
        return wxuserid;
    }

    public void setWxuserid(String wxuserid) {
        this.wxuserid = wxuserid == null ? null : wxuserid.trim();
    }

    public String getOtuserid() {
        return otuserid;
    }

    public void setOtuserid(String otuserid) {
        this.otuserid = otuserid == null ? null : otuserid.trim();
    }

    public String getReserve1() {
        return reserve1;
    }

    public void setReserve1(String reserve1) {
        this.reserve1 = reserve1 == null ? null : reserve1.trim();
    }

    public String getReserve2() {
        return reserve2;
    }

    public void setReserve2(String reserve2) {
        this.reserve2 = reserve2 == null ? null : reserve2.trim();
    }

    public String getReserve3() {
        return reserve3;
    }

    public void setReserve3(String reserve3) {
        this.reserve3 = reserve3 == null ? null : reserve3.trim();
    }

    public String getExternid() {
        return externid;
    }

    public void setExternid(String externid) {
        this.externid = externid == null ? null : externid.trim();
    }
}