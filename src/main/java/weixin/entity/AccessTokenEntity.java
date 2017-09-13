package weixin.entity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-18:16
 */
public class AccessTokenEntity {

    private Integer errcode;

    private String errmsg;

    private String access_token;

    private long expires_in;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(long expires_in) {
        this.expires_in = expires_in;
    }
}
