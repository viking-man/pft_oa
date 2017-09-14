package oa.user.controller;

import common.error.ErrorConst;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.service.ILoginService;
import oa.user.service.WXService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import param.GlobleConstant;
import weixin.entity.UseridEntity;

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

            if (request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT) == null
                    && LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT) == null) {
                if (wxService.wxLogin(request, model))
                    return "index";
                else
                    return "login";
            } else {
                LoginTokenContext loginTokenContext =
                        request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT) == null ?
                                LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT) :
                                (LoginTokenContext) request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT);

                wxService.wxBind(loginTokenContext, request.getParameter("code"), model);
                return "userinfo";
            }
        }

        if (request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT) != null)
            return "index";
        else
            return "login";
    }
}
