package com.xjk.project.admin.model;

import java.util.ArrayList;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/12/26 下午12:55
 */
public class ConsumeTypeResult {

    private ConsumeTypeModel consumeTypeModel;

    private ArrayList<ConsumeTypeResult> consumeTypeResultList;

    public ConsumeTypeModel getConsumeTypeModel() {
        return consumeTypeModel;
    }

    public void setConsumeTypeModel(ConsumeTypeModel consumeTypeModel) {
        this.consumeTypeModel = consumeTypeModel;
    }

    public ArrayList<ConsumeTypeResult> getConsumeTypeResultList() {
        return consumeTypeResultList;
    }

    public void setConsumeTypeResultList(ArrayList<ConsumeTypeResult> consumeTypeResultList) {
        this.consumeTypeResultList = consumeTypeResultList;
    }

    @Override
    public String toString() {
        return "ConsumeTypeResult{" +
                "consumeTypeModel=" + consumeTypeModel +
                ", consumeTypeResultList=" + consumeTypeResultList +
                '}';
    }
}
