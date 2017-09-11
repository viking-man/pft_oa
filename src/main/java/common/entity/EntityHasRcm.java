package common.entity;

import javax.persistence.Column;
import java.util.Date;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/11-11:42
 */
public abstract class EntityHasRcm {

    @Column
    private Long rowstamp;

    @Column
    private Long createuser;

    @Column
    private Date createtime;

    @Column
    private Long modifyuser;

    @Column
    private Date modifytime;

    public Long getRowstamp() {
        return rowstamp;
    }

    public void setRowstamp(Long rowstamp) {
        this.rowstamp = rowstamp;
    }

    public Long getCreateuser() {
        return createuser;
    }

    public void setCreateuser(Long createuser) {
        this.createuser = createuser;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Long getModifyuser() {
        return modifyuser;
    }

    public void setModifyuser(Long modifyuser) {
        this.modifyuser = modifyuser;
    }

    public Date getModifytime() {
        return modifytime;
    }

    public void setModifytime(Date modifytime) {
        this.modifytime = modifytime;
    }
}
