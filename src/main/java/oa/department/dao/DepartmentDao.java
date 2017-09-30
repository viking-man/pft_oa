package oa.department.dao;

import common.dao.BaseDao;
import oa.department.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao extends BaseDao<DepartmentEntity> {
    int deleteByPrimaryKey(Long id);

    int insertSelective(DepartmentEntity record);

    DepartmentEntity selectByPrimaryKey(Long id);

    DepartmentEntity selectByUserid(Long userid);

    DepartmentEntity selectByDepartmentno(String departmentno);

    int updateByPrimaryKey(DepartmentEntity record);

    @Override
    List<DepartmentEntity> queryAll();

    @Override
    DepartmentEntity select(Long id);

    @Override
    Long insert(DepartmentEntity entity);

    @Override
    int update(DepartmentEntity entity);

    @Override
    void delete(Long id);
}