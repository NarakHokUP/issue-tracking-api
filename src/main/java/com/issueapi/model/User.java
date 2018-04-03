package com.issueapi.model;

import java.sql.Timestamp;
import java.util.List;

public class User {

	private int userID;
	private String userName;
	private String password;
	private String createBy;
	private String updateBy;
	private Timestamp createDate;
	private Timestamp updateDate;

	private List<Branch> branchs;
	private List<Role> roles;

	public User() {
		super();
	}

	public User(int userID, String userName, String password, String createBy, String updateBy, Timestamp createDate,
			Timestamp updateDate) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

	public List<Branch> getBranchs() {
		return branchs;
	}

	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", password=" + password + ", createBy=" + createBy
				+ ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate=" + updateDate + ", branchs="
				+ branchs + ", roles=" + roles + "]";
	}

}
