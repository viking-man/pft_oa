package oa.user.user.dao;

import oa.user.user.entity.UserEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    Long insertAndReturnId(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    UserEntity selectByWxuserid(String weixinId);

    UserEntity selectByUserno(String userno);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);

    List<UserEntity> queryAllUser();

    List<UserEntity> queryByWxuserid(String wxuserid);
}