package oa.user.department.dao;

import oa.user.department.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentDao {
    int deleteByPrimaryKey(Long id);

    int insert(DepartmentEntity record);

    int insertSelective(DepartmentEntity record);

    DepartmentEntity selectByPrimaryKey(Long id);

    DepartmentEntity selectByDepartmentno(String departmentno);

    List<DepartmentEntity> queryAll();

    int updateByPrimaryKeySelective(DepartmentEntity record);

    int updateByPrimaryKey(DepartmentEntity record);
}