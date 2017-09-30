package context;

import oa.user.user.entity.UserEntity;
import util.UuidUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-12:11
 */
public class LoginTokenContext {

    public LoginTokenContext() {
    }

    public LoginTokenContext(UserEntity user) {
        setTokenid(UuidUtil.getNewMsgId());
        setUserid(user.getId());
        setUsername(user.getUsername());
        setUserno(user.getUserno());
        setWxuserid(user.getWxuserid());
    }

    private String tokenid;

    private Long userid;

    private String userno;

    private String username;

    private String departmentno;

    private String wxuserid;

    private String rolecode;

    private List<String> rolePermissionUrls = new ArrayList<>();

    public String getTokenid() {
        return tokenid;
    }

    public void setTokenid(String tokenid) {
        this.tokenid = tokenid;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDepartmentno() {
        return departmentno;
    }

    public void setDepartmentno(String departmentno) {
        this.departmentno = departmentno;
    }

    public String getWxuserid() {
        return wxuserid;
    }

    public void setWxuserid(String wxuserid) {
        this.wxuserid = wxuserid;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }

    public List<String> getRolePermissionUrls() {
        return rolePermissionUrls;
    }

    public void setRolePermissionUrls(List<String> rolePermissionUrls) {
        this.rolePermissionUrls = rolePermissionUrls;
    }
}
