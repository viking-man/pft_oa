package oa.user.dao;

import oa.user.entity.PermissionEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}