package oa.user.user.dao;

import common.dao.BaseDao;
import oa.user.user.entity.UserroleEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserroleDao extends BaseDao<UserroleEntity> {
    int deleteByPrimaryKey(Long id);

    int insertSelective(UserroleEntity record);

    UserroleEntity selectByPrimaryKey(Long id);

    UserroleEntity selectByUserid(Long userid);

}