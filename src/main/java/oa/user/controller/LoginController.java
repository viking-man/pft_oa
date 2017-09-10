package oa.user.controller;

import oa.user.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String checkLogin(HttpServletRequest request, Model model) {

        if (iLoginService.checkLoginState(request, model)) {
            return "index";
        }

        model.addAttribute("error", "用户名或密码验证错误，请联系管理员");
        return "login";
    }
}
