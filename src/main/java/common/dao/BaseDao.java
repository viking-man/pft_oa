package common.dao;

import common.entity.BaseEntity;
import common.entity.EntityHasRcm;

import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/18-11:34
 */
public interface BaseDao<T extends EntityHasRcm> {

    public List<T> queryAll();

    public T select(Long id);

    public Long insert(T entity);

    public int update(T entity);

    public void delete(Long id);

}
