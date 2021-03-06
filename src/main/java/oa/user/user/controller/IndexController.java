package oa.user.user.controller;

import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import context.WeixinContext;
import context.WeixinContextHolder;
import oa.user.user.entity.UserEntity;
import oa.user.user.service.IUserService;
import oa.user.user.service.WXService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import param.GlobleConstant;
import param.WeiXinConstant;

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
public class IndexController {

    @Resource
    private WXService wxService;

    @Resource
    private IUserService iUserService;

    @RequestMapping(value = "/index.do")
    public String checkLogin(HttpServletRequest request, Model model) {
        String code = request.getParameter("code");
        String state = request.getParameter("state");
        WeixinContext bindContext = WeixinContextHolder.getToken(WeiXinConstant.WEIXIN_BINDUSER_KEY);
        LoginTokenContext tokenContext = LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT);

        if (StringUtils.isNotBlank(code) && StringUtils.isNotBlank(state) && StringUtils.equals(state, WeiXinConstant.WEIXIN_State)) {

            if (bindContext == null) {
                if (wxService.wxLogin(request, model))
                    return "/WEB-INF/original/index.jsp";
                else
                    return "login";
            } else if (tokenContext != null && bindContext.getUserfor() == WeiXinConstant.WEIXIN_BIND) {

                if (wxService.wxBind(bindContext, request.getParameter("code"), model)) {
                    model.addAttribute("error", "绑定成功");
                }

                getAllUsers(model);
                return "/html/oa/user/user/query.jsp";
            }
        }

        if (tokenContext != null)
            return "/original/index";
        else
            return "login";
    }

    private void getAllUsers(Model model) {
        List<UserEntity> users = iUserService.queryAllUser();
        model.addAttribute("users", users);
    }
}
