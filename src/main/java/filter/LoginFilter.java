package filter;

import context.LoginTokenContextHolder;
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
        if (LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT) != null) {
            return true;
        }

        httpServletRequest.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(httpServletRequest, httpServletResponse);
        return false;
    }

    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        if (LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT) != null && modelAndView != null) {
            modelAndView.addObject("loginuser", LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT));
        }
    }

    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
