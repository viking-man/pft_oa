package oa.user.user.dao;

import oa.user.user.entity.UserDepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDepartmentDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserDepartmentEntity record);

    int insertSelective(UserDepartmentEntity record);

    UserDepartmentEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserDepartmentEntity record);

    int updateByPrimaryKey(UserDepartmentEntity record);
}