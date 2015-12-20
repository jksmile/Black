package com.xjk.project.common.model;

/**
 * Intro:
 * Project: projectA
 * Date:    3/22/15
 * Author:  xujinkai
 */


public class UserModel {

	private int userId;

	private String userName;

	private String userPass;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}


	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	@Override
	public String toString() {
		return "UserModel{" +
				"userId=" + userId +
				", userName='" + userName + '\'' +
				", userPass='" + userPass + '\'' +
				'}';
	}

}
