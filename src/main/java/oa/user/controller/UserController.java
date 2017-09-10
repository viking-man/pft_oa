package oa.user.controller;

import oa.user.entity.UserTestEntity;
import oa.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
public class UserController {

    @RequestMapping("/forwardToUser.do")
    public String toIndex(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null)
            return "grids";
        else
            return "login";
    }
}
