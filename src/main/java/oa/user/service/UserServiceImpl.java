package oa.user.service;

import context.LoginTokenContext;
import context.LoginTokenContextHolder;
import oa.user.dao.*;
import oa.user.entity.*;
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

    @Resource
    private RoleEntityMapper roleEntityMapper;

    @Resource
    private UserroleEntityMapper userroleEntityMapper;

    @Resource
    private DepartmentEntityMapper departmentEntityMapper;

    @Resource
    private UserDepartmentEntityMapper userDepartmentEntityMapper;

    @Transactional
    public void insert(String rolecode, String departmentno, UserEntity user) {
        user.actionBeforeInsert();

        Long userid = userDao.insertAndReturnId(user);

        RoleEntity roleEntity = roleEntityMapper.selectByUserno(rolecode);
        UserroleEntity userroleEntity = new UserroleEntity();
        userroleEntity.actionBeforeInsert();
        userroleEntity.setUserid(userid);
        userroleEntity.setRoleid(roleEntity.getId());
        userroleEntityMapper.insert(userroleEntity);

        DepartmentEntity departmentEntity = departmentEntityMapper.selectByDepartmentno(departmentno);
        UserDepartmentEntity userDepartmentEntity = new UserDepartmentEntity();
        userDepartmentEntity.actionBeforeInsert();
        userDepartmentEntity.setUserid(userid);
        userDepartmentEntity.setDepartmentid(departmentEntity.getId());
        userDepartmentEntityMapper.insert(userDepartmentEntity);
    }

    public boolean update(UserEntity user) {
        Assert.notNull(user);
        Assert.notNull(LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT));

        UserEntity userEntity = userDao.selectByPrimaryKey(user.getId());
        if (userEntity == null)
            return false;

        user.setModifytime(new Date());
        user.setModifyuser(LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT).getUserid());
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
