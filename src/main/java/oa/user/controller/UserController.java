package oa.user.controller;

import oa.user.entity.UserEntity;
import oa.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/userQuery.do")
    public String queryUserInfo(Model model) {

        return getAllUsers(model);
    }

    @RequestMapping("/userCreate.do")
    public String userCreate() {

        return "usercreate";
    }

    @RequestMapping("/userEdit.do")
    public String userEdit(Long id, Model model) {
        UserEntity userEntity = iUserService.selectByid(id);
        model.addAttribute("user", userEntity);
        return "useredit";
    }

    @RequestMapping("/userInsert.do")
    public String userInsert(HttpServletRequest request, UserEntity user, Model model) {
        try {
            if (iUserService.insert(request, user)) {
                return getAllUsers(model);
            } else
                model.addAttribute("error", "插入失败!");
        } catch (Exception e) {
            model.addAttribute("error", "插入失败:" + e.getMessage());
        }
        return "userinfo";
    }

    private String getAllUsers(Model model) {
        List<UserEntity> users = iUserService.queryAllUser();
        model.addAttribute("users", users);
        return "userinfo";
    }

    @RequestMapping("/userUpdate.do")
    public String userUpdate(HttpServletRequest request, UserEntity user, Model model) {
        try {
            if (iUserService.update(request, user))
                return getAllUsers(model);
            else
                model.addAttribute("error", "更新失败!");
        } catch (Exception e) {
            model.addAttribute("error", "更新失败:" + e.getMessage());
        }
        return "userinfo";
    }

    @RequestMapping("/userDelete.do")
    public String userDelete(Long id, Model model) {
        try {
            if (iUserService.delete(id)) {
                return getAllUsers(model);
            } else {
                model.addAttribute("error", "删除失败！");
            }
        } catch (Exception e) {
            model.addAttribute("error", "删除失败:" + e.getMessage());
        }

        return "userinfo";
    }
}
