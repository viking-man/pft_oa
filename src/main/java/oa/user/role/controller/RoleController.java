package oa.user.role.controller;

import common.controller.BaseController;
import common.service.BaseService;
import oa.user.role.service.RoleService;
import oa.user.role.service.RoleServiceImpl;
import oa.user.user.entity.RoleEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/18-9:52
 */
@Controller
@RequestMapping("/oa/user/role")
public class RoleController extends BaseController<RoleEntity, RoleServiceImpl> {

    @Resource
    private RoleService roleService;

}
