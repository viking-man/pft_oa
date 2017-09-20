package oa.user.role.service;

import common.service.BaseServiceImpl;
import oa.user.role.dao.RoleDao;
import oa.user.role.entity.RoleEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/18-9:55
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<RoleEntity, RoleDao> implements RoleService {

    @Resource
    private RoleDao roleDao;

    @Override
    protected RoleDao getBaseDao() {
        return roleDao;
    }
}
