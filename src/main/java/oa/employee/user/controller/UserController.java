package oa.employee.user.controller;

import oa.employee.user.entity.UserEntity;
import oa.employee.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.xml.registry.infomodel.User;

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
        Long userId = Long.parseLong(request.getParameter("id"));
        UserEntity user = iUserService.fetchById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
