package oa.user.service;

import oa.user.entity.UserEntity;
import oa.user.entity.UserTestEntity;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/6-14:28
 */
public interface IUserService {

    boolean insert(HttpServletRequest request, UserEntity user);

    boolean update(HttpServletRequest request, UserEntity user);

    boolean delete(Long id);

    UserEntity selectByid(Long id);

    List<UserEntity> queryAllUser();
}
