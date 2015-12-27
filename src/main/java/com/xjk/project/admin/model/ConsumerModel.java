package com.xjk.project.admin.model;

/**
 * Intro:
 * Project: Black
 * Date:    12/27/15
 * Author:  xujinkai
 */


public class ConsumerModel {

	private int consumerId;

	private int consumerPid;

	private String consumerName;

	public int getConsumerId() {
		return consumerId;
	}

	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}

	public int getConsumerPid() {
		return consumerPid;
	}

	public void setConsumerPid(int consumerPid) {
		this.consumerPid = consumerPid;
	}

	public String getConsumerName() {
		return consumerName;
	}

	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}


	@Override
	public String toString() {
		return "ConsumerModel{" +
				"consumerId=" + consumerId +
				", consumerPid=" + consumerPid +
				", consumerName='" + consumerName + '\'' +
				'}';
	}
}
