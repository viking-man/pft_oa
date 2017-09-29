package activiti.entity;

/**
 * Project : pft_oa
 *
 * @author : jiangwei
 * @create : 2017/9/29-14:23
 */
public class DeploymentEntity {

    private String ID_;

    private String NAME_;

    private String CATEGORY_;

    private String TENANT_ID_;

    private Long DEPLOY_TIME_;

    public String getID_() {
        return ID_;
    }

    public void setID_(String ID_) {
        this.ID_ = ID_;
    }

    public String getNAME_() {
        return NAME_;
    }

    public void setNAME_(String NAME_) {
        this.NAME_ = NAME_;
    }

    public String getCATEGORY_() {
        return CATEGORY_;
    }

    public void setCATEGORY_(String CATEGORY_) {
        this.CATEGORY_ = CATEGORY_;
    }

    public String getTENANT_ID_() {
        return TENANT_ID_;
    }

    public void setTENANT_ID_(String TENANT_ID_) {
        this.TENANT_ID_ = TENANT_ID_;
    }

    public Long getDEPLOY_TIME_() {
        return DEPLOY_TIME_;
    }

    public void setDEPLOY_TIME_(Long DEPLOY_TIME_) {
        this.DEPLOY_TIME_ = DEPLOY_TIME_;
    }
}
