package com.issueapi.model;

import java.util.List;

public class Issue {

	private int issueId;
	private int categoryId;
	private User user;
	private int departmentId;
	private String issueName;
	private String issueDetail;
	private String issuedDate;
	private String updateDate;
	private String issueStatus;

	public Issue() {
		super();
	}

	public Issue(int issueId, int categoryId, User user, int departmentId, String issueName, String issueDetail,
			String issuedDate, String updateDate, String issueStatus) {
		super();
		this.issueId = issueId;
		this.categoryId = categoryId;
		this.user = user;
		this.departmentId = departmentId;
		this.issueName = issueName;
		this.issueDetail = issueDetail;
		this.issuedDate = issuedDate;
		this.updateDate = updateDate;
		this.issueStatus = issueStatus;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getIssueName() {
		return issueName;
	}

	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getIssueDetail() {
		return issueDetail;
	}

	public void setIssueDetail(String issueDetail) {
		this.issueDetail = issueDetail;
	}

	public String getIssuedDate() {
		return issuedDate;
	}

	public void setIssuedDate(String issuedDate) {
		this.issuedDate = issuedDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getIssueStatus() {
		return issueStatus;
	}

	public void setIssueStatus(String issueStatus) {
		this.issueStatus = issueStatus;
	}

	@Override
	public String toString() {
		return "Issue [issueId=" + issueId + ", categoryId=" + categoryId + ", user=" + user + ", departmentId="
				+ departmentId + ", issueName=" + issueName + ", issueDetail=" + issueDetail + ", issuedDate="
				+ issuedDate + ", updateDate=" + updateDate + ", issueStatus=" + issueStatus + "]";
	}

}
