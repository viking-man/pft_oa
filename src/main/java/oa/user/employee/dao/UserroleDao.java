package oa.user.employee.dao;

import oa.user.employee.entity.UserroleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserroleDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserroleEntity record);

    int insertSelective(UserroleEntity record);

    UserroleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserroleEntity record);

    int updateByPrimaryKey(UserroleEntity record);
}