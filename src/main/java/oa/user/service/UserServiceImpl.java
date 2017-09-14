package oa.user.service;

import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.dao.UserEntityMapper;
import oa.user.entity.UserEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import param.GlobleConstant;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
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

    @Transactional
    public boolean insert(HttpServletRequest request, UserEntity user) {

        LoginTokenContext context = (LoginTokenContext) request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT);

        user.actionBeforeInsert(context.getUserid());

        int insert = userDao.insert(user);
        if (insert != 0)
            return true;
        return false;
    }

    public boolean update(HttpServletRequest request, UserEntity user) {
        Assert.notNull(user);
        Assert.notNull(request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT));

        UserEntity userEntity = userDao.selectByPrimaryKey(user.getId());
        if (userEntity == null)
            return false;

        LoginTokenContext context = (LoginTokenContext) request.getSession().getAttribute(GlobleConstant.SESSION_LOGIN_CONTEXT);

        user.setModifytime(new Date());
        user.setModifyuser(context.getUserid());
        int flag = userDao.updateByPrimaryKeySelective(user);
        if (flag != 0)
            return true;
        return false;
    }

    public boolean delete(Long id) {
        Assert.notNull(id);

        int i = userDao.deleteByPrimaryKey(id);
        if (i != 0)
            return true;
        return false;
    }

    public UserEntity selectByid(Long id) {
        return userDao.selectByPrimaryKey(id);
    }

    public List<UserEntity> queryAllUser() {
        return userDao.queryAllUser();
    }
}
