package oa.user.user.service;

import context.LoginTokenContextHolder;
import oa.department.dao.DepartmentDao;
import oa.department.entity.DepartmentEntity;
import oa.user.user.dao.*;
import oa.user.user.entity.*;
import oa.user.role.dao.RoleDao;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import param.GlobleConstant;

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
    private UserDao userDao;

    @Resource
    private RoleDao roleDao;

    @Resource
    private UserroleDao userroleDao;

    @Resource
    private DepartmentDao departmentDao;

    @Resource
    private UserDepartmentDao userDepartmentDao;

    @Transactional
    public void insert(String rolecode, String departmentno, UserEntity user) {
        user.actionBeforeInsert();

        Long userid = userDao.insertAndReturnId(user);

        RoleEntity roleEntity = roleDao.selectByUserno(rolecode);
        UserroleEntity userroleEntity = new UserroleEntity();
        userroleEntity.actionBeforeInsert();
        userroleEntity.setUserid(userid);
        userroleEntity.setRoleid(roleEntity.getId());
        userroleDao.insert(userroleEntity);

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        UserDepartmentEntity userDepartmentEntity = new UserDepartmentEntity();
        userDepartmentEntity.actionBeforeInsert();
        userDepartmentEntity.setUserid(userid);
        userDepartmentEntity.setDepartmentid(departmentEntity.getId());
        userDepartmentDao.insert(userDepartmentEntity);
    }

    public boolean update(UserEntity user) {
        Assert.notNull(user);
        Assert.notNull(LoginTokenContextHolder.getToken(GlobleConstant.SESSION_LOGIN_CONTEXT));

        UserEntity userEntity = userDao.selectByPrimaryKey(user.getId());
        if (userEntity == null)
            return false;

        user.actionBeforUpdate();
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
