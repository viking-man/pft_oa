package weixin.controller;

import common.controller.BaseController;
import context.WeixinContextHolder;
import oa.user.user.entity.UserEntity;
import oa.user.user.service.UsersService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/10/13-17:26
 */
@Controller
@RequestMapping("/wx/user/user")
public class WXUserController extends BaseController<UserEntity, UsersService> {

    @Resource
    private UsersService service;

    @Override
    protected UsersService getService() {
        return service;
    }

    @RequestMapping("/display.do")
    public void wxUserDisplay() {
    }
}
