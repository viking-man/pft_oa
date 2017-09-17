package oa.user.department.service;

import oa.user.department.dao.DepartmentDao;
import oa.user.department.entity.DepartmentEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-16:25
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Resource
    private DepartmentDao departmentDao;

    @Override
    public List<DepartmentEntity> queryAll() {
        return departmentDao.queryAll();
    }
}
