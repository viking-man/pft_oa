package oa.user.controller;

import context.LoginTokenContext;
import context.WeixinBindContext;
import context.WeixinBindContextHolder;
import oa.user.service.WXService;
import org.apache.commons.lang3.StringUtils;
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
public class IndexController {

    @Resource
    private WXService wxService;

    @RequestMapping(value = "/index.do")
    public String checkLogin(HttpServletRequest request, Model model) {
        String code = request.getParameter("code");
        String state = request.getParameter("state");
        if (StringUtils.isNotBlank(code) && StringUtils.isNotBlank(state) && StringUtils.equals(state, GlobleConstant.WEIXIN_State)) {

            if (WeixinBindContextHolder.getToken(GlobleConstant.WEIXIN_BINDUSER_KEY) == null) {
                if (wxService.wxLogin(request, model))
                    return "index";
                else
                    return "login";
            } else {

                WeixinBindContext bindContext = WeixinBindContextHolder.getToken(GlobleConstant.WEIXIN_BINDUSER_KEY);
                if (wxService.wxBind(bindContext, request.getParameter("code"), model))
                    return "forward:/userQuery.do";
                return "userinfo";
            }
        }

        if (request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT) != null)
            return "index";
        else
            return "login";
    }
}
