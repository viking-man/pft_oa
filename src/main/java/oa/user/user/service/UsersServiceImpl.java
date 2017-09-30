package oa.user.user.service;

import common.error.BasicException;
import common.service.BaseServiceImpl;
import oa.department.dao.DepartmentDao;
import oa.department.entity.DepartmentEntity;
import oa.department.service.DepartmentService;
import oa.user.role.dao.RoleDao;
import oa.user.role.entity.RoleEntity;
import oa.user.role.service.RoleService;
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
    private RoleService roleService;

    @Resource
    private RoleDao roleDao;

    @Resource
    private UserroleDao userroleDao;

    @Resource
    private UserroleService userroleService;

    @Resource
    private UserDepartmentService userDepartmentService;

    @Resource
    private DepartmentDao departmentDao;

    @Resource
    private UserDepartmentDao userDepartmentDao;

    @Resource
    private DepartmentService departmentService;

    @Override
    protected UsersDao getBaseDao() {
        return usersDao;
    }

    @Override
    public List<UserBean> queryBeans() {
        List<UserEntity> users = queryAll();

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
    public UserBean update(UserEntity entity, String rolecode, String departmentno) throws BasicException {
        update(entity);

        RoleEntity roleEntity = roleDao.selectByRolecode(rolecode);
        if (roleEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的角色定义", rolecode));
        UserroleEntity userroleEntity = userroleDao.selectByUserid(entity.getId());
        if (userroleEntity == null) {
            UserroleEntity userrole = new UserroleEntity();
            userrole.setUserid(entity.getId());
            userrole.setRoleid(roleEntity.getId());
            userroleService.insert(userrole);
        } else {
            userroleEntity.setRoleid(roleEntity.getId());
            userroleService.update(userroleEntity);
        }

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        if (departmentEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的部门", departmentno));
        UserDepartmentEntity userDepartmentEntity = userDepartmentDao.selectByUserid(entity.getId());
        if (userDepartmentEntity == null) {
            UserDepartmentEntity userDepartment = new UserDepartmentEntity();
            userDepartment.setUserid(entity.getId());
            userDepartment.setDepartmentid(departmentEntity.getId());
            userDepartmentService.insert(userDepartment);
        } else {
            userDepartmentEntity.setDepartmentid(departmentEntity.getId());
            userDepartmentService.update(userDepartmentEntity);
        }

        return getUserBean(entity, roleEntity, departmentEntity);
    }

    private UserBean getUserBean(UserEntity entity, RoleEntity roleEntity, DepartmentEntity departmentEntity) {
        UserBean bean = new UserBean();
        bean.setUser(entity);
        bean.setRole(roleEntity);
        bean.setDepartment(departmentEntity);
        return bean;
    }

    @Override
    public UserBean insert(UserEntity entity, String rolecode, String departmentno) throws BasicException {
        UserEntity userEntity = insert(entity);

        RoleEntity roleEntity = roleDao.selectByRolecode(rolecode);
        if (roleEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的角色定义", rolecode));
        UserroleEntity userroleEntity = new UserroleEntity();
        userroleEntity.setRoleid(roleEntity.getId());
        userroleEntity.setUserid(userEntity.getId());
        userroleService.insert(userroleEntity);

        DepartmentEntity departmentEntity = departmentDao.selectByDepartmentno(departmentno);
        if (departmentEntity == null)
            throw new BasicException(String.format("不存在此编码(%s)对应的部门", departmentno));
        UserDepartmentEntity userDepartmentEntity = new UserDepartmentEntity();
        userDepartmentEntity.setDepartmentid(departmentEntity.getId());
        userDepartmentEntity.setUserid(userEntity.getId());
        userDepartmentService.insert(userDepartmentEntity);

        return getUserBean(entity, roleEntity, departmentEntity);
    }
}
