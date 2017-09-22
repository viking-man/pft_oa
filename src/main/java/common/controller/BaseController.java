package common.controller;

import common.entity.EntityHasRcm;
import common.error.BasicException;
import common.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import param.ApiResponseBody;
import param.ResponseConst;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-12:29
 */
@RestController
public abstract class BaseController<T extends EntityHasRcm, S extends BaseService<T>> {

    protected abstract S getService();

    @RequestMapping("/query.do")
    @ResponseBody
    public ApiResponseBody<T> query() {
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE, getService().queryAll());
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public ApiResponseBody<T> update(T entity) throws BasicException {
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE, getService().update(entity));
    }

    @RequestMapping("/insert.do")
    @ResponseBody
    public ApiResponseBody<T> insert(T entity) throws BasicException {
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE, getService().insert(entity));
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public ApiResponseBody<T> query(Long id) {
        getService().delete(id);
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE);
    }

    @RequestMapping("/select.do")
    public ApiResponseBody<T> select(Long id) {
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE, getService().select(id));
    }

    @RequestMapping("/edit.do")
    @ResponseBody
    public ApiResponseBody<T> edit(String id) {
        return new ApiResponseBody<T>(ResponseConst.SUCCESS_CODE, getService().select(Long.valueOf(id)));
    }
}
