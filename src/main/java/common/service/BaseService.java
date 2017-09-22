package common.service;

import common.entity.EntityHasRcm;
import common.error.BasicException;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/18-10:32
 */
public interface BaseService<T extends EntityHasRcm> {

    public List<T> queryAll();

    public T select(Long id);

    public T insert(T entity) throws BasicException;

    public T update(T entity) throws BasicException;

    public void delete(Long id);
}
