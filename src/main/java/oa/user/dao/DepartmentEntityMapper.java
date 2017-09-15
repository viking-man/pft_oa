package oa.user.dao;

import oa.user.entity.DepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DepartmentEntity record);

    int insertSelective(DepartmentEntity record);

    DepartmentEntity selectByPrimaryKey(Long id);

    DepartmentEntity selectByDepartmentno(String departmentno);

    int updateByPrimaryKeySelective(DepartmentEntity record);

    int updateByPrimaryKey(DepartmentEntity record);
}