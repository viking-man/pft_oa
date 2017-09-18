package common.service;

import common.dao.BaseDao;
import common.entity.EntityHasRcm;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/18-11:30
 */
public abstract class BaseServiceImpl<T extends EntityHasRcm, D extends BaseDao<T>> implements BaseService<T> {

    @Resource
    private D baseDao;

    @Override
    public List<T> queryAll() {
        return baseDao.queryAll();
    }

    @Override
    public T select(Long id) {
        return baseDao.select(id);
    }

    @Override
    public T insert(T entity) {
        entity.actionBeforeInsert();
        return baseDao.insert(entity);
    }

    @Override
    public T update(T entity) {
        entity.actionBeforUpdate();
        return baseDao.update(entity);
    }

    @Override
    public void delete(Long id) {
        baseDao.delete(id);
    }
}
