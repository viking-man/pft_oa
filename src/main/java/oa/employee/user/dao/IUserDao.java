package oa.employee.user.dao;

import oa.employee.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:31
 */
@Mapper
public interface IUserDao {
    UserEntity fetchById(Long id);
}
