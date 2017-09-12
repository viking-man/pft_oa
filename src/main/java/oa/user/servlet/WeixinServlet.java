package oa.user.servlet;

import param.GlobleConstant;
import weixin.AesException;
import weixin.WXBizMsgCrypt;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/12-11:55
 */
public class WeixinServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String msg_signature = req.getParameter("msg_signature");
        String timestamp = req.getParameter("timestamp");
        String nonce = req.getParameter("nonce");
        String echostr = req.getParameter("echostr");
//        String msg_encrypt = msg.getMsg_encrypt();
        String sEchoStr;
        try {
            WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(GlobleConstant.WEIXIN_Token, GlobleConstant.WEIXIN_EncodingAESKey, GlobleConstant.WEIXIN_CorpID);
            sEchoStr = wxcpt.VerifyURL(msg_signature, timestamp,
                    nonce, echostr);
            System.out.println("verifyurl echostr: " + sEchoStr);
        } catch (AesException e) {
            e.printStackTrace();
        }

        super.doGet(req, resp);
    }
}
