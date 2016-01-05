package com.xjk.project.admin.model;

import java.sql.Timestamp;

/**
 * @author Jinkai.Xu
 * @Datetime 16/1/1 下午10:52
 */
public class BillModel {

    private int consumerId;

    private int consumeTypeId;

    private double amount;

    private Timestamp consumeDate;

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

    public Timestamp getConsumeDate() {
        return consumeDate;
    }

    public void setConsumeDate(Timestamp consumeDate) {
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

    @Override
    public String toString() {
        return "BillModel{" +
                "consumerId=" + consumerId +
                ", consumeTypeId=" + consumeTypeId +
                ", amount=" + amount +
                ", consumeDate=" + consumeDate +
                ", uid=" + uid +
                ", type=" + type +
                ", todo='" + todo + '\'' +
                '}';
    }
}
