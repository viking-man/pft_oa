package context;

import oa.user.entity.UserEntity;
import util.UuidUtil;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-12:11
 */
public class WeixinContext {

    public WeixinContext() {
    }

    public WeixinContext(UserEntity user, int userfor) {
        setTokenid(UuidUtil.getNewMsgId());
        setUserid(user.getId());
        setUsername(user.getUsername());
        setUserno(user.getUserno());
        setUserfor(userfor);
    }

    private String tokenid;

    private Long userid;

    private String userno;

    private String username;

    private int userfor;

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

    public int getUserfor() {
        return userfor;
    }

    public void setUserfor(int userfor) {
        this.userfor = userfor;
    }
}
