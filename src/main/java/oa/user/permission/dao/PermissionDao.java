package oa.user.permission.dao;

import common.dao.BaseDao;
import oa.user.permission.entity.PermissionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionDao extends BaseDao<PermissionEntity> {
//    int deleteByPrimaryKey(Long id);
//
//    int insert(PermissionEntity record);
//
//    int insertSelective(PermissionEntity record);
//
//    PermissionEntity selectByPrimaryKey(Long id);
//
//    int updateByPrimaryKeySelective(PermissionEntity record);
//
//    int updateByPrimaryKey(PermissionEntity record);

    List<PermissionEntity> batchQuery(List<String> permissions);
}