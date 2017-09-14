package weixin.entity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-20:45
 */
public class UseridEntity {

    private String UserId;

    private Integer errcode;

    private String DeviceId;

    private String errmsg;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

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

    public String getDeviceId() {
        return DeviceId;
    }

    public void setDeviceId(String deviceId) {
        DeviceId = deviceId;
    }
}
