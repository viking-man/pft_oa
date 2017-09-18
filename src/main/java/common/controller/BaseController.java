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

    @Resource
    private S service;

    @RequestMapping("/query.do")
    public Map<String, List<T>> query() {
        Map<String, List<T>> map = new HashMap();
        map.put("query", service.queryAll());
        return map;
    }

    @RequestMapping("/update.do")
    public T update(T entity) {
        return service.update(entity);
    }

    @RequestMapping("/insert.do")
    public T insert(T entity) {
        return service.insert(entity);
    }

    @RequestMapping("/delete.do")
    public void query(Long id) {
        service.delete(id);
    }

    @RequestMapping("/select.do")
    public T select(Long id) {
        return service.select(id);
    }

    @RequestMapping("/edit.do")
    @ResponseBody
    public Map<String, T> edit(String id) {
        Map<String, T> map = new HashMap();
        map.put("edit", service.select(Long.valueOf(id)));
        return map;
    }

    @ExceptionHandler({BasicException.class})
    public String baseException(BasicException bx) {
        logger.error(bx.getMessage(), bx);
        Map<String, String> map = new HashMap<>();
        map.put("error", bx.getMessage());
        return "exception";
    }

    @ExceptionHandler({Exception.class})
    public String baseException(Exception ex) {
        logger.error(ex.getMessage(), ex);
        Map<String, String> map = new HashMap<>();
        map.put("error", ex.getMessage());
        return "exception";
    }
}
