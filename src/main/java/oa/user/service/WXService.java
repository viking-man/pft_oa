package oa.user.service;

import context.LoginTokenContext;
import org.springframework.ui.Model;
import weixin.entity.UseridEntity;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
public interface WXService {
    boolean wxLogin(HttpServletRequest request, Model model);

    boolean wxBind(LoginTokenContext context, String code, Model model);

}
