package oa.user.user.controller;

import common.entity.EntityHasRcm;
import common.error.BasicException;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.user.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import param.ApiResponseBody;
import param.GlobleConstant;
import param.ResponseConst;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-20:16
 */
@Controller
public class LoginController {

    @Resource
    private ILoginService iLoginService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public String login(String userno, String password, Model model, HttpServletRequest request) throws BasicException {

        if (iLoginService.login(userno, password, request) != null) {
            return "index";
        }

        model.addAttribute("error", "用户名或密码验证错误，请联系管理员");
        return "login";
    }

//    @RequestMapping("/login.do")
//    @ResponseBody
//    public ApiResponseBody login(String userno, String password) throws BasicException {
//        LoginTokenContext tokenContext = iLoginService.login(userno, password);
//        if (tokenContext != null) {
//            ApiResponseBody<EntityHasRcm> responseBody = new ApiResponseBody<>(ResponseConst.SUCCESS_CODE);
//            responseBody.setTokenContext(LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT));
//            return responseBody;
//        } else {
//            return new ApiResponseBody(ResponseConst.ERROR_CODE, "登录失败");
//        }
//    }

    @RequestMapping(value = "/logout.do")
    public String logout() {

        LoginTokenContextHolder.clear();

        return "login";
    }
}
