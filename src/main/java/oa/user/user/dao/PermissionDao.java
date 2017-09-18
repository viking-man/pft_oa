package oa.user.user.dao;

import oa.user.user.entity.PermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionDao {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}