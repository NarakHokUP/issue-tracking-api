package com.issueapi.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority{
	private int roleid;
	private String role;
	private String createby;
	private String updateby;
	private String createdate;
	private String updatedate;
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getCreateby() {
		return createby;
	}
	public void setCreateby(String createby) {
		this.createby = createby;
	}
	public String getUpdateby() {
		return updateby;
	}
	public void setUpdateby(String updateby) {
		this.updateby = updateby;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	public Role(int roleid, String role, String createby, String updateby, String createdate, String updatedate) {
		super();
		this.roleid = roleid;
		this.role = role;
		this.createby = createby;
		this.updateby = updateby;
		this.createdate = createdate;
		this.updatedate = updatedate;
	}
	public Role() {
		super();
	}
	public Role(String role, String createby, String updateby, String createdate, String updatedate) {
		super();
		this.role = role;
		this.createby = createby;
		this.updateby = updateby;
		this.createdate = createdate;
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", role=" + role + ", createby=" + createby + ", updateby=" + updateby
				+ ", createdate=" + createdate + ", updatedate=" + updatedate + "]";
	}
	@Override
	public String getAuthority() {
		
		return "ROLE_" + role;
	}
	
	
}
