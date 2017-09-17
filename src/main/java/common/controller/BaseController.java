package common.controller;

import common.entity.EntityHasRcm;
import common.error.BasicException;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/17-12:29
 */
public abstract class BaseController<T extends EntityHasRcm> {

    public List<EntityHasRcm> query() {

        return new ArrayList<>();
    }
}
