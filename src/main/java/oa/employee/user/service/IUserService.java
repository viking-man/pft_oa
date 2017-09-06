package oa.employee.user.service;

import oa.employee.user.entity.UserEntity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:28
 */
public interface IUserService {
    UserEntity fetchById(Integer id);
}
