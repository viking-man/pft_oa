package oa.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import param.GlobleConstant;
import weixin.AesException;
import weixin.WXBizMsgCrypt;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-21:15
 */
@Controller
public class WeixinController {

    @RequestMapping("/weixin.do")
    public String queryUserInfo(HttpServletRequest request, Model model) {
        String msg_signature = request.getParameter("msg_signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
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


        return "userinfo";
    }
}
