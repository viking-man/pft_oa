package oa.user.user.controller;

import common.error.BasicException;
import common.error.ErrorConst;
import oa.user.user.entity.UserEntity;
import oa.user.user.service.IUserService;
import oa.user.user.service.WXService;
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
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-21:15
 */
@Controller
public class WeixinController {

    @Resource
    private WXService wxService;

    @Resource
    private IUserService iUserService;

    @RequestMapping("/wxBind.do")
    public String wxBind(Long id, Model model, HttpServletResponse response) {
        try {
            wxService.requestToWeixinForBind(id, response);
        } catch (BasicException e) {
            e.printStackTrace();
            getAllUsers(model);
            model.addAttribute(ErrorConst.ERROR, e.getMessage());
            return "/WEB-INF/jsp/oa/user/query.jsp";
        } catch (IOException e) {
            e.printStackTrace();
            getAllUsers(model);
            model.addAttribute(ErrorConst.ERROR, e.getMessage());
            return "/WEB-INF/jsp/oa/user/query.jsp";
        }

        return "/WEB-INF/jsp/oa/user/query.jsp";
    }

    @RequestMapping("/removeWxBind.do")
    public String removeWxBind(Long id, Model model) {

        try {
            if (wxService.removeWxBind(id)) {
                getAllUsers(model);
                model.addAttribute("error", "解除绑定成功");
            }
        } catch (BasicException e) {
            e.printStackTrace();
            getAllUsers(model);
            model.addAttribute("error", "解除绑定失败");
        }

        return "/WEB-INF/jsp/oa/user/query.jsp";
    }

    private void getAllUsers(Model model) {
        List<UserEntity> users = iUserService.queryAllUser();
        model.addAttribute("users", users);
    }

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
