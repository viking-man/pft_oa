package oa.user.controller;

import oa.user.entity.UserEntity;
import oa.user.entity.UserTestEntity;
import oa.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import param.GlobleConstant;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-20:16
 */
@Controller
public class UserController {

    @Resource
    private IUserService iUserService;

    @RequestMapping("/queryUserInfo.do")
    public String queryUserInfo(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null) {

            List<UserEntity> users = iUserService.queryAllUser();
            model.addAttribute("users", users);
            return "userinfo";
        } else
            return "login";
    }

    @RequestMapping("/userCreate.do")
    public String userCreate(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null) {

            List<UserEntity> users = iUserService.queryAllUser();
            model.addAttribute("users", users);
            return "userinfo";
        } else
            return "login";
    }

    @RequestMapping("/userInsert.do")
    public String userInsert(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null) {

            List<UserEntity> users = iUserService.queryAllUser();
            model.addAttribute("users", users);
            return "userinfo";
        } else
            return "login";
    }

    @RequestMapping("/userUpdate.do")
    public String userUpdate(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null) {

            List<UserEntity> users = iUserService.queryAllUser();
            model.addAttribute("users", users);
            return "userinfo";
        } else
            return "login";
    }

    @RequestMapping("/userDelete.do")
    public String userDelete(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute(GlobleConstant.SESSION_USER_KEY) != null) {

            List<UserEntity> users = iUserService.queryAllUser();
            model.addAttribute("users", users);
            return "userinfo";
        } else
            return "login";
    }
}
