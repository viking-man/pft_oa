package common.controller;

import common.entity.EntityHasRcm;
import common.error.BasicException;
import common.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-12:29
 */
@RestController
public abstract class BaseController<T extends EntityHasRcm, S extends BaseService<T>> {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected abstract BaseService<T> getService();

    @RequestMapping("/query.do")
    @ResponseBody
    public List<T> query() {
        return getService().queryAll();
    }

    @RequestMapping("/update.do")
    @ResponseBody
    public T update(T entity) throws BasicException {
        return getService().update(entity);
    }

    @RequestMapping("/insert.do")
    @ResponseBody
    public T insert(T entity) throws BasicException {
        return getService().insert(entity);
    }

    @RequestMapping("/delete.do")
    @ResponseBody
    public Long query(Long id) {
        getService().delete(id);
        return id;
    }

    @RequestMapping("/select.do")
    public T select(Long id) {
        return getService().select(id);
    }

    @RequestMapping("/edit.do")
    @ResponseBody
    public T edit(String id) {
        return getService().select(Long.valueOf(id));
    }

    @ExceptionHandler({BasicException.class})
    public String baseException(BasicException bx, Model model) {
        logger.error(bx.getMessage(), bx);
        model.addAttribute("error", bx.getMessage());
        return "exception";
    }

    @ExceptionHandler({Exception.class})
    public String baseException(Exception ex, Model model) {
        logger.error(ex.getMessage(), ex);
        model.addAttribute("error", ex.getMessage());
        return "exception";
    }
}
