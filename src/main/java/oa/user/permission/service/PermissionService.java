package oa.user.permission.service;

import common.dao.BaseDao;
import common.error.BasicException;
import common.service.BaseService;
import oa.user.permission.entity.PermissionBean;
import oa.user.permission.entity.PermissionEntity;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/19-16:36
 */
public interface PermissionService extends BaseService<PermissionEntity> {
    PermissionBean readRolePermission(Long roleid) throws BasicException;

    List<PermissionEntity> queryRolePermission(String rolecode) throws BasicException;
}
