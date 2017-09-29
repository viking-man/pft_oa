package oa.user.user.service;

import common.service.BaseService;
import oa.user.user.entity.UserBean;
import oa.user.user.entity.UserEntity;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-16:09
 */
public interface UsersService extends BaseService<UserEntity> {

    List<UserBean> queryBeans();

    UserBean update(UserEntity entity, String rolecode, String departmentno);
}
