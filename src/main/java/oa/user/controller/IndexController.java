package oa.user.controller;

import oa.user.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import param.GlobleConstant;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-20:16
 */
@Controller
public class IndexController {

    @RequestMapping(value = "/index.do")
    public String checkLogin(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null)
            return "index";
        else
            return "login";
    }
}
