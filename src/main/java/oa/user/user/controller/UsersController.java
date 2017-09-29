package oa.user.user.controller;

import common.controller.BaseController;
import common.entity.EntityHasRcm;
import common.error.BasicException;
import oa.user.user.entity.UserBean;
import oa.user.user.entity.UserEntity;
import oa.user.user.service.UsersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import param.ApiResponseBody;
import param.ResponseConst;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-15:19
 */
@RestController
@RequestMapping("/oa/user/users")
public class UsersController extends BaseController<UserEntity, UsersService> {

    @Resource
    private UsersService service;

    @Override
    protected UsersService getService() {
        return service;
    }

    @Override
    public ApiResponseBody<UserEntity> query() {
        List<UserBean> userBeans = service.queryBeans();
        ApiResponseBody responseBody = new ApiResponseBody<>(ResponseConst.SUCCESS_CODE);
        responseBody.setEntities(userBeans);
        return responseBody;
    }

    public ApiResponseBody<UserEntity> update(UserEntity entity, String rolecode, String departmentno) throws BasicException {
        service.update(entity,rolecode,departmentno);
    }
}
