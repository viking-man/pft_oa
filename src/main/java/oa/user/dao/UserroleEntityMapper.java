package oa.user.dao;

import oa.user.entity.UserroleEntity;

public interface UserroleEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserroleEntity record);

    int insertSelective(UserroleEntity record);

    UserroleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserroleEntity record);

    int updateByPrimaryKey(UserroleEntity record);
}