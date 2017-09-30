package filter;

import common.error.BasicException;
import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import param.GlobleConstant;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by jiang on 2017/9/10.
 */
public class LoginFilter implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        LoginTokenContext tokenContext = LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT);
        if (tokenContext != null) {

            if (StringUtils.equals(tokenContext.getUserno(), "admin"))
                return true;

            String requestURI = httpServletRequest.getRequestURI();
            if (!StringUtils.equals(requestURI, "/login.do") && !StringUtils.equals(requestURI, "/logout.do")) {
                if (tokenContext.getRolePermissionUrls() == null || CollectionUtils.isEmpty(tokenContext.getRolePermissionUrls()))
                    throw new BasicException("权限项为空，请配置权限");
                else if (!tokenContext.getRolePermissionUrls().contains(requestURI))
                    throw new BasicException("您无此权限项，请配置权限");
            }

            return true;
        } else if (StringUtils.equals(httpServletRequest.getRequestURI(), "/oa/user/login/login.do")) {
            return true;
        } else {
            httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
            return false;
        }

    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
//        if (LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT) != null && modelAndView != null) {
//            modelAndView.addObject("loginuser", LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT));
//        }
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
