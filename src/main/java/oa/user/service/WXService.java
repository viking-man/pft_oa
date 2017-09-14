package oa.user.service;

import common.error.BasicException;
import context.LoginTokenContext;
import context.WeixinBindContext;
import org.springframework.ui.Model;
import weixin.entity.UseridEntity;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/13-17:27
 */
public interface WXService {
    boolean wxLogin(HttpServletRequest request, Model model);

    boolean wxBind(WeixinBindContext context, String code, Model model);

    void requestToWeixin(Long id, HttpServletResponse response) throws BasicException, IOException;
}
