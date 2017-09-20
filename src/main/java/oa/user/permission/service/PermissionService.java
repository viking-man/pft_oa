package oa.user.permission.service;

import common.error.BasicException;
import common.service.BaseService;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-16:36
 */
public interface PermissionService {
    PermissionBean readRolePermission(Long roleid) throws BasicException;
}
