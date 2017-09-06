package oa.employee.user.service;

import oa.employee.user.dao.IUserDao;
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
    private IUserDao iUserDao;

    public UserEntity fetchById(Long id) {
        return iUserDao.fetchById(id);
    }
}
