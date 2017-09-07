package oa.user.service;

import oa.user.dao.UserTestEntityMapper;
import oa.user.entity.UserTestEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:29
 */
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserTestEntityMapper userDao;

    public UserTestEntity fetchById(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }

    public int insert(UserTestEntity userTestEntity) {
        return userDao.insert(userTestEntity);
    }
}
