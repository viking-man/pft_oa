package oa.user.employee.dao;

import oa.user.employee.entity.RoleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Long id);

    RoleEntity selectByUserno(String rolecode);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}