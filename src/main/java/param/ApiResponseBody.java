package param;

import common.entity.EntityHasRcm;
import context.LoginTokenContext;

import java.io.Serializable;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/21-14:59
 */
public class ApiResponseBody<T extends EntityHasRcm> {

    private String code;

    private String successmsg;

    private String errormsg;

    private T item;

    private List<T> items;

    private LoginTokenContext tokenContext;

    private Object entity;

    private List<Object> entities;

    public ApiResponseBody() {
    }

    public ApiResponseBody(String code, T item) {
        this.code = code;
        this.item = item;
    }

    public ApiResponseBody(String code) {
        this.code = code;
    }

    public ApiResponseBody(String code, List<T> items) {
        this.code = code;
        this.items = items;
    }

    public ApiResponseBody(String code, String errormsg) {
        this.code = code;
        this.errormsg = errormsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSuccessmsg() {
        return successmsg;
    }

    public void setSuccessmsg(String successmsg) {
        this.successmsg = successmsg;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    public LoginTokenContext getTokenContext() {
        return tokenContext;
    }

    public void setTokenContext(LoginTokenContext tokenContext) {
        this.tokenContext = tokenContext;
    }

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public List<Object> getEntities() {
        return entities;
    }

    public void setEntities(List<Object> entities) {
        this.entities = entities;
    }
}
