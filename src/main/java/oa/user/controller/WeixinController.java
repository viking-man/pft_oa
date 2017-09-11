package oa.user.controller;

import oa.user.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-21:15
 */
@Controller
public class WeixinController {

    @RequestMapping("/weixin")
    public String queryUserInfo(HttpServletRequest request, Model model) {
        return "userinfo";
    }
}
