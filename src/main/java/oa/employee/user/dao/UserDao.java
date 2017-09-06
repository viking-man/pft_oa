package oa.employee.user.dao;

import oa.employee.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:31
 */
public interface UserDao {
    UserEntity fetchById(Integer id);
}
