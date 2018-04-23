package com.issueapi.model;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class User implements UserDetails{

	private int userId;
	private String username;
	private String password;
	private String createBy;
	private String updateBy;
	private String createDate;
	private String updateDate;
	private Integer departmentId;
	private Integer branchId;
	private List<Role> roles;

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public Integer getBranchId() {
		return branchId;
	}
	public void setBranchId(Integer branchId) {
		this.branchId = branchId;
	}
	public User() {
	}
	
	public User( String username, String password, String createBy, String updateBy, String createDate,
			String updateDate, Integer departmentId, Integer branchId, List<Role> roles) {
		this.username = username;
		this.password = password;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.departmentId = departmentId;
		this.branchId = branchId;
		this.roles = roles;
	}
	public User(int userId, String username, String password, String createBy, String updateBy, String createDate,
			String updateDate, Integer departmentId, Integer branchId, List<Role> roles) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.departmentId = departmentId;
		this.branchId = branchId;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", createBy=" + createBy
				+ ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", departmentId=" + departmentId + ", branchId=" + branchId + ", roles=" + roles + "]";
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return roles;
	}
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}


}
