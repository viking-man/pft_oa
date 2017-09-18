package oa.user.user.service;

import common.error.BasicException;
import context.WeixinContext;
import org.springframework.ui.Model;

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

    boolean wxBind(WeixinContext context, String code, Model model);

    boolean removeWxBind(Long id) throws BasicException;

    void requestToWeixinForBind(Long id, HttpServletResponse response) throws BasicException, IOException;
}
