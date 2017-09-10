package oa.user.service;

import oa.user.dao.UserEntityMapper;
import oa.user.entity.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserEntityMapper userDao;


    public boolean insert(UserEntity record) {
        return false;
    }

    public boolean update(UserEntity record) {
        return false;
    }

    public int delete(Long id) {
        return 0;
    }

    public List<UserEntity> queryAllUser() {
        return userDao.queryAllUser();
    }
}
