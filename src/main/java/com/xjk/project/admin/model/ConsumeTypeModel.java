package com.xjk.project.admin.model;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/26 下午12:30
 */
public class ConsumeTypeModel {

    private int consumeTypeId;

    private int consumeTypePid;

    private String consumeTypeName;

    public int getConsumeTypeId() {
        return consumeTypeId;
    }

    public void setConsumeTypeId(int consumeTypeId) {
        this.consumeTypeId = consumeTypeId;
    }

    public int getConsumeTypePid() {
        return consumeTypePid;
    }

    public void setConsumeTypePid(int consumeTypePid) {
        this.consumeTypePid = consumeTypePid;
    }

    public String getConsumeTypeName() {
        return consumeTypeName;
    }

    public void setConsumeTypeName(String consumeTypeName) {
        this.consumeTypeName = consumeTypeName;
    }

    @Override
    public String toString() {
        return "ConsumeTypeModel{" +
                "consumeTypeId=" + consumeTypeId +
                ", consumeTypePid=" + consumeTypePid +
                ", consumeTypeName='" + consumeTypeName + '\'' +
                '}';
    }
}
