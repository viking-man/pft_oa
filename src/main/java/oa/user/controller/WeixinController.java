package oa.user.controller;

import oa.user.service.WXService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import param.GlobleConstant;
import weixin.AesException;
import weixin.WXBizMsgCrypt;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-21:15
 */
@Controller
@RequestMapping
public class WeixinController {

    @RequestMapping("/wx/checkUrl.do")
    public void queryUserInfo(HttpServletRequest request, HttpServletResponse response) {
        String msg_signature = request.getParameter("msg_signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        String sEchoStr;
        try {
            WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(GlobleConstant.WEIXIN_Token, GlobleConstant.WEIXIN_EncodingAESKey, GlobleConstant.WEIXIN_CorpID);
            sEchoStr = wxcpt.VerifyURL(msg_signature, timestamp, nonce, echostr);

            response.getWriter().println(sEchoStr);
        } catch (AesException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
