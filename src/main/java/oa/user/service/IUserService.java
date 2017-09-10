package oa.user.service;

import oa.user.entity.UserEntity;
import oa.user.entity.UserTestEntity;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:28
 */
public interface IUserService {

    boolean insert(UserEntity record);

    boolean update(UserEntity record);

    int delete(Long id);

    List<UserEntity> queryAllUser();
}
