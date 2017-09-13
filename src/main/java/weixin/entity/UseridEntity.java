package weixin.entity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-20:45
 */
public class UseridEntity {

    private String UserId;

    private int errcode;

    private String errmsg;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
