package oa.employee.user.service;

import oa.employee.user.dao.UserDao;
import oa.employee.user.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:29
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    public UserEntity fetchById(Integer id) {
        return userDao.fetchById(id);
    }
}
