package oa.user.entity;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/12-11:02
 */
@XmlRootElement(name = "xml")
public class MsgFromWeixin {

    private String toUser;

    private String toAgentID;

    private String msg_encrypt;

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser;
    }

    public String getToAgentID() {
        return toAgentID;
    }

    public void setToAgentID(String toAgentID) {
        this.toAgentID = toAgentID;
    }

    public String getMsg_encrypt() {
        return msg_encrypt;
    }

    public void setMsg_encrypt(String msg_encrypt) {
        this.msg_encrypt = msg_encrypt;
    }
}
