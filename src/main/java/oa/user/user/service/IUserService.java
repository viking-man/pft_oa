package oa.user.user.service;

import oa.user.user.entity.UserEntity;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:28
 */
public interface IUserService {

    void insert(String rolecode, String departmentno, UserEntity user);

    boolean update(UserEntity user);

    boolean delete(Long id);

    UserEntity selectByid(Long id);

    List<UserEntity> queryAllUser();
}
