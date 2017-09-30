package oa.user.user.service;

import common.service.BaseServiceImpl;
import oa.user.user.dao.UserroleDao;
import oa.user.user.entity.UserroleEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/30-10:34
 */
@Service
public class UserroleServiceImpl extends BaseServiceImpl<UserroleEntity, UserroleDao> implements UserroleService {

    @Resource
    private UserroleDao dao;

    @Override
    protected UserroleDao getBaseDao() {
        return dao;
    }
}
