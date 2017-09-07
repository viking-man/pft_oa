package oa.user.service;

import oa.user.entity.UserTestEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:28
 */
public interface IUserService {
    UserTestEntity fetchById(Integer id);

    int insert(UserTestEntity userTestEntity);
}
