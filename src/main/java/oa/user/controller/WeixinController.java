package oa.user.controller;

import oa.user.service.WXLoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import param.GlobleConstant;
import param.Request;
import weixin.AesException;
import weixin.WXBizMsgCrypt;

import javax.annotation.Resource;
import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-21:15
 */
@Controller
@RequestMapping("/wx")
public class WeixinController {

    @Resource
    private WXLoginService wxLoginService;

    @RequestMapping("/login")
    public String wxLogin(HttpServletRequest request, Model model) {
        wxLoginService.checkLoginState(request, model);
        return null;
    }

    @RequestMapping("/checkUrl.do")
    public void queryUserInfo(HttpServletRequest request, Model model, HttpServletResponse response) {
        String msg_signature = request.getParameter("msg_signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");

        System.out.println("msg_signature:" + msg_signature + "timestamp:" + timestamp + "nonce:" + nonce + "echostr:" + echostr);
//        String msg_encrypt = msg.getMsg_encrypt();
        String sEchoStr;
        try {
            WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(GlobleConstant.WEIXIN_Token, GlobleConstant.WEIXIN_EncodingAESKey, GlobleConstant.WEIXIN_CorpID);
            sEchoStr = wxcpt.VerifyURL(msg_signature, timestamp,
                    nonce, echostr);
            PrintWriter writer = response.getWriter();
            writer.println(sEchoStr);
            System.out.println("verifyurl echostr: " + sEchoStr);
        } catch (AesException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
