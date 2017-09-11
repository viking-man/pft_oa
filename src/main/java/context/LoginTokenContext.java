package context;

import oa.user.entity.UserEntity;
import util.UuidUtil;

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
        setDepartment(user.getDepartment());
    }

    private String tokenid;

    private Long userid;

    private String userno;

    private String username;

    private String department;

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
