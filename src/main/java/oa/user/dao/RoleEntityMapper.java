package oa.user.dao;

import oa.user.entity.RoleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Long id);

    RoleEntity selectByUserno(String rolecode);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}