package com.xjk.project.admin.model;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午10:52
 */
public class BillResult {

    private int consumerId;

    private String consumerName;

    private int consumeTypeId;

    private String consumeTypeName;

    private double amount;

    private String consumeDate;

    private int uid;

    private int type;

    private String todo;

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

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumeTypeName() {
        return consumeTypeName;
    }

    public void setConsumeTypeName(String consumeTypeName) {
        this.consumeTypeName = consumeTypeName;
    }



    @Override
    public String toString() {
        return "BillResult{" +
                "consumerId=" + consumerId +
                ", consumerName='" + consumerName + '\'' +
                ", consumeTypeId=" + consumeTypeId +
                ", consumeTypeName='" + consumeTypeName + '\'' +
                ", amount=" + amount +
                ", consumeDate='" + consumeDate + '\'' +
                ", uid=" + uid +
                ", type=" + type +
                ", todo='" + todo + '\'' +
                '}';
    }
}
