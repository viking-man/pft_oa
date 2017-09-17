package oa.user.employee.service;

import org.springframework.ui.Model;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/8-18:20
 */
public interface ILoginService {

    boolean login(String userno, String password, Model model);

}
