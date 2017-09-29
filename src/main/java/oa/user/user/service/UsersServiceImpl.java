package oa.user.user.service;

import common.error.BasicException;
import common.service.BaseServiceImpl;
import oa.department.dao.DepartmentDao;
import oa.department.entity.DepartmentEntity;
import oa.user.role.dao.RoleDao;
import oa.user.role.entity.RoleEntity;
import oa.user.user.dao.UserDepartmentDao;
import oa.user.user.dao.UserroleDao;
import oa.user.user.dao.UsersDao;
import oa.user.user.entity.UserBean;
import oa.user.user.entity.UserDepartmentEntity;
import oa.user.user.entity.UserEntity;
import oa.user.user.entity.UserroleEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-16:09
 */
@Service
public class UsersServiceImpl extends BaseServiceImpl<UserEntity, UsersDao> implements UsersService {

    @Resource
    private UsersDao usersDao;

    @Resource
    private RoleDao roleDao;

    @Resource
    private UserroleDao userroleDao;

    @Resource
    private UserDepartmentDao userDepartmentDao;

    @Resource
    private DepartmentDao departmentDao;

    @Override
    protected UsersDao getBaseDao() {
        return usersDao;
    }

    @Override
    public List<UserBean> queryBeans() {
        List<UserEntity> users = usersDao.queryAll();

        List<UserBean> beans = new ArrayList<>();
        for (UserEntity user : users) {
            RoleEntity roleEntity = roleDao.selectByUserid(user.getId());
            DepartmentEntity departmentEntity = departmentDao.selectByUserid(user.getId());
            UserBean bean = new UserBean();
            bean.setDepartment(departmentEntity);
            bean.setRole(roleEntity);
            bean.setUser(user);
            beans.add(bean);
        }

        return beans;
    }

    @Override
    public UserBean update(UserEntity entity, String rolecode, String departmentno) {
        usersDao.update(entity);

        RoleEntity roleEntity = roleDao.selectByUserno(rolecode);
        UserroleEntity userroleEntity = userroleDao.selectByUserid(entity.getId());
        if (userroleEntity == null) {
            UserroleEntity userrole = new UserroleEntity();
            userrole.setUserid(entity.getId());
            userrole.setRoleid(roleEntity.getId());
            userroleDao.insert(userrole);
        } else {
            userroleEntity.setRoleid(roleEntity.getId());
            userroleDao.update(userroleEntity);
        }

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        UserDepartmentEntity userDepartmentEntity = userDepartmentDao.selectByUserid(entity.getId());
        if (userDepartmentEntity == null) {
            UserDepartmentEntity userDepartment = new UserDepartmentEntity();
            userDepartment.setUserid(entity.getId());
            userDepartment.setDepartmentid(departmentEntity.getId());
            userDepartmentDao.insert(userDepartment);
        } else {
            userDepartmentEntity.setDepartmentid(departmentEntity.getId());
            userDepartmentDao.updateByPrimaryKeySelective(userDepartmentEntity);
        }

        return null;
    }
}
