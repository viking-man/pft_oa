package oa.user.controller;

import oa.user.entity.UserTestEntity;
import oa.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-20:16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        Integer userId = Integer.parseInt(request.getParameter("id"));
        UserTestEntity user = iUserService.fetchById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
