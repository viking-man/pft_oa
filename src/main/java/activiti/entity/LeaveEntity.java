package activiti.entity;

import common.entity.EntityHasRcm;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/30-16:41
 */
public class LeaveEntity extends EntityHasRcm {

    private String username;

    private int days;

    private String reason;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
