package com.issueapi.model;

import java.sql.Timestamp;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority{
	private int roleID;
	private String role;
	private String createBy;
	private String updateBy;
	private Timestamp createDate;
	private Timestamp updateDate;

	public Role() {
		super();
	}

	public Role(int roleID, String role, String createBy, String updateBy, Timestamp createDate,
			Timestamp updateDate) {
		super();
		this.roleID = roleID;
		this.role = role;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getRoleID() {
		return roleID;
	}

	public void setRoleID(int roleID) {
		this.roleID = roleID;
	}

	public String getrole() {
		return role;
	}

	public void setrole(String role) {
		this.role = role;
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

	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", role=" + role + ", createBy=" + createBy + ", updateBy=" + updateBy
				+ ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

	@Override
	public String getAuthority() {
		return "ROLE_" + role;
	}

}
