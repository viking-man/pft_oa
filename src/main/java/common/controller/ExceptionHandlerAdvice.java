package common.controller;

import common.error.BasicException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import param.ApiResponseBody;
import param.ResponseConst;

import java.net.BindException;


/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/22-10:38
 */
@EnableWebMvc
@ControllerAdvice
public class ExceptionHandlerAdvice {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler(BasicException.class)
    @ResponseBody
    public ApiResponseBody BasicException(BasicException bx) {
        logger.error(bx.getMessage(), bx);
        return new ApiResponseBody(ResponseConst.ERROR_PARAM, bx.getMessage());
    }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ApiResponseBody baseException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return new ApiResponseBody(ResponseConst.ERROR_CODE, ex.getMessage());
    }

//    @ExceptionHandler
//    @ResponseBody
//    public ApiResponseBody Exception(Exception ex) {
//        logger.error(ex.getMessage(), ex);
//        return new ApiResponseBody(ResponseConst.ERROR_CODE, ex.getMessage());
//    }

    @ExceptionHandler(DataAccessException.class)
    @ResponseBody
    public ApiResponseBody DataAccessException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return new ApiResponseBody(ResponseConst.ERROR_DAO, ex.getMessage());
    }

    @ExceptionHandler(BindException.class)
    @ResponseBody
    public ApiResponseBody BindException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        return new ApiResponseBody(ResponseConst.ERROR_DAO, ex.getMessage());
    }


}
