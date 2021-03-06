package oa.user.user.service;

import common.error.BasicException;
import context.LoginTokenContext;

import javax.servlet.http.HttpServletRequest;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/8-18:20
 */
public interface ILoginService {

    LoginTokenContext login(String userno, String password, HttpServletRequest request) throws BasicException;

}
