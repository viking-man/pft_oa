package oa.user.user.service;

import common.service.BaseServiceImpl;
import oa.user.user.dao.UserDepartmentDao;
import oa.user.user.entity.UserDepartmentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/30-10:36
 */
@Service
public class UserDepartmentServiceImpl extends BaseServiceImpl<UserDepartmentEntity, UserDepartmentDao> implements UserDepartmentService {

    @Resource
    private UserDepartmentDao dao;

    @Override
    protected UserDepartmentDao getBaseDao() {
        return dao;
    }
}
