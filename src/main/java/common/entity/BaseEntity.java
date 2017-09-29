package common.entity;

import javax.persistence.Column;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-14:04
 */
public abstract class BaseEntity {
    @Column
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
