package oa.user.dao;

import oa.user.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface UserEntityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    UserEntity selectByUsername(String username);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    List<UserEntity> queryAllUser();
}