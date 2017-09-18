package oa.department.service;

import oa.department.entity.DepartmentEntity;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-16:24
 */
public interface DepartmentService {

    List<DepartmentEntity> queryAll();
}
