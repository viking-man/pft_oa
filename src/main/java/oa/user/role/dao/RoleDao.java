package oa.user.role.dao;

import common.dao.BaseDao;
import oa.user.role.entity.RoleEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao extends BaseDao<RoleEntity> {

    RoleEntity selectByUserno(String rolecode);

    @Override
    List<RoleEntity> queryAll();

    @Override
    RoleEntity select(Long id);

    RoleEntity selectByUserid(Long userid);

    @Override
    Long insert(RoleEntity entity);

    @Override
    int update(RoleEntity entity);

    @Override
    void delete(Long id);
}