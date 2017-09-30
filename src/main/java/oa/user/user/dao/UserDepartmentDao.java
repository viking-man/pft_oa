package oa.user.user.dao;

import common.dao.BaseDao;
import oa.user.user.entity.UserDepartmentEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDepartmentDao extends BaseDao<UserDepartmentEntity> {
    int deleteByPrimaryKey(Long id);

    int insertSelective(UserDepartmentEntity record);

    UserDepartmentEntity selectByPrimaryKey(Long id);

    UserDepartmentEntity selectByUserid(Long userid);

    int updateByPrimaryKey(UserDepartmentEntity record);
}