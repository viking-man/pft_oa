package oa.user.permission.controller;

import common.controller.BaseController;
import common.error.BasicException;
import common.error.ErrorConst;
import common.service.BaseService;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;
import oa.user.permission.service.PermissionService;
import oa.user.permission.service.PermissionServiceImpl;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import param.ApiResponseBody;
import param.ResponseConst;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-16:17
 */
@RestController
@RequestMapping("/oa/user/permission")
public class PermissionController extends BaseController<PermissionEntity, PermissionService> {

    @Resource
    private PermissionService service;

    @Override
    protected PermissionService getService() {
        return service;
    }

    //    @Override
//    public PermissionBean query() {
//        return service.readRolePermission(null);
//    }

    @RequestMapping("/readRolePermission.do")
    public PermissionBean readRolePermission(Long roleid) throws BasicException {

        return service.readRolePermission(roleid);
    }

    @RequestMapping("/queryRolePermission.do")
    @ResponseBody
    public ApiResponseBody<PermissionEntity> queryRolePermissionByRolecode(String rolecode) throws BasicException {

        if (StringUtils.isBlank(rolecode))
            return query();
        else {
            List<PermissionEntity> permissions = service.queryRolePermission(rolecode);
            return new ApiResponseBody<PermissionEntity>(ResponseConst.SUCCESS_CODE, permissions);
        }
    }

    @RequestMapping("/distributeRolePermissions.do")
    @ResponseBody
    public ApiResponseBody<PermissionEntity> distributeRolePermissions(Long[] permissionIds, String rolecode) throws BasicException {

        service.distributeRolePermissions(permissionIds, rolecode);
        return new ApiResponseBody<>(ResponseConst.SUCCESS_CODE);
    }

    @RequestMapping("/distributeDepartmentPermissions.do")
    @ResponseBody
    public ApiResponseBody<PermissionEntity> distributeDepartmentPermissions(Long[] permissionIds, String departmentno) throws BasicException {

        service.distributeDepartmentPermissions(permissionIds, departmentno);
        return new ApiResponseBody<>(ResponseConst.SUCCESS_CODE);
    }

    @RequestMapping("/queryDepartmentPermission.do")
    @ResponseBody
    public ApiResponseBody<PermissionEntity> queryDepartmentPermission(String departmentno) throws BasicException {

        if (StringUtils.isBlank(departmentno))
            return query();
        else {
            List<PermissionEntity> permissions = service.queryDepartmentPermission(departmentno);
            return new ApiResponseBody<PermissionEntity>(ResponseConst.SUCCESS_CODE, permissions);
        }
    }
}
