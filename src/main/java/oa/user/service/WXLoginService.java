package oa.user.service;

import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
public interface WXLoginService {
    boolean checkLoginState(HttpServletRequest request, Model model);
}
