package oa.user.permission.controller;

import common.controller.BaseController;
import common.error.BasicException;
import common.service.BaseService;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;
import oa.user.permission.service.PermissionService;
import oa.user.permission.service.PermissionServiceImpl;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-16:17
 */
@RestController
@RequestMapping("/oa/user/permission")
public class PermissionController extends BaseController<PermissionEntity, PermissionServiceImpl> {

    @Resource
    private PermissionServiceImpl service;

    @Override
    protected BaseService<PermissionEntity> getService() {
        return service;
    }

//    @Override
//    public PermissionBean query() {
//        return service.readRolePermission(null);
//    }

    @RequestMapping("/readRolePermission.do")
    public String readRolePermission(Long roleid, Model model) {

        try {
            PermissionBean permissionBean = service.readRolePermission(roleid);
            model.addAttribute("bean", permissionBean);
        } catch (BasicException bx) {
            model.addAttribute("error", bx.getMessage());
        }

        return "/oa/user/permission/query";
    }


}
