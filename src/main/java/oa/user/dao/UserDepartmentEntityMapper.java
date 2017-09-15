package oa.user.dao;

import oa.user.entity.UserDepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDepartmentEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserDepartmentEntity record);

    int insertSelective(UserDepartmentEntity record);

    UserDepartmentEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDepartmentEntity record);

    int updateByPrimaryKey(UserDepartmentEntity record);
}