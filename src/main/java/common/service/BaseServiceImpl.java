package common.service;

import common.dao.BaseDao;
import common.entity.EntityHasRcm;
import common.error.BasicException;
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

    protected abstract D getBaseDao();

    @Override
    public List<T> queryAll() {
        return getBaseDao().queryAll();
    }

    @Override
    public T select(Long id) {
        return getBaseDao().select(id);
    }

    @Override
    public T insert(T entity) throws BasicException {
        entity.actionBeforeInsert();
        Long insertId = getBaseDao().insert(entity);
        if (insertId != null)
            return entity;
        throw new BasicException("插入数据库时出错");
    }

    @Override
    public T update(T entity) throws BasicException {
        entity.actionBeforUpdate();
        int update = getBaseDao().update(entity);
        if (update != 0)
            return entity;
        throw new BasicException("更新实体时数据库出错");
    }

    @Override
    public void delete(Long id) {
        getBaseDao().delete(id);
    }
}
