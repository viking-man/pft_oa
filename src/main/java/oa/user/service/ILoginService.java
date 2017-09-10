package oa.user.service;

import oa.user.entity.UserEntity;
import org.springframework.ui.Model;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/8-18:20
 */
public interface ILoginService {
    boolean checkLoginState(HttpServletRequest request, Model model);
}
