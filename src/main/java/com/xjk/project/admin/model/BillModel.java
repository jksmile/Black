package com.xjk.project.admin.model;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午10:52
 */
public class BillModel {

    private int consumerId;

    private int consumeTypeId;

    private double amount;

    private String consumeDate;

    private int uid;

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public int getConsumeTypeId() {
        return consumeTypeId;
    }

    public void setConsumeTypeId(int consumeTypeId) {
        this.consumeTypeId = consumeTypeId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(String consumeDate) {
        this.consumeDate = consumeDate;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }


    @Override
    public String toString() {
        return "BillModel{" +
                "consumerId=" + consumerId +
                ", consumeTypeId=" + consumeTypeId +
                ", amount=" + amount +
                ", consumeDate='" + consumeDate + '\'' +
                ", uid=" + uid +
                '}';
    }
}
