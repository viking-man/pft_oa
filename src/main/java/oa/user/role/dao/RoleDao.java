package oa.user.role.dao;

import common.dao.BaseDao;
import oa.user.user.entity.RoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao extends BaseDao<RoleEntity> {

    RoleEntity selectByUserno(String rolecode);

    @Override
    List<RoleEntity> queryAll();

    @Override
    RoleEntity select(Long id);

    @Override
    RoleEntity insert(RoleEntity entity);

    @Override
    RoleEntity update(RoleEntity entity);

    @Override
    void delete(Long id);
}