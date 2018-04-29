package com.issueapi.model;

import java.util.List;

public class Issue {

	private int issueId;
	private int issueTypeId;
	private int userId;
	private int departmentId;
	private String issueName;
	private String issueDetail;
	private String issuedDate;
	private String updateDate;
	private String issueStatus;

	public Issue() {
		super();
	}

	public Issue(int issueId, int issueTypeId, int userId, int departmentId, String issueName, String issueDetail,
			String issueDate, String updateDate, String issueStatus) {
		super();
		this.issueId = issueId;
		this.issueTypeId = issueTypeId;
		this.userId = userId;
		this.departmentId = departmentId;
		this.issueName = issueName;
		this.issueDetail = issueDetail;
		this.issuedDate = issueDate;
		this.updateDate = updateDate;
		this.issueStatus = issueStatus;
	}

	public int getIssueId() {
		return issueId;
	}

	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}

	public int getIssueTypeId() {
		return issueTypeId;
	}

	public void setIssueTypeId(int issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public void setIssuedDate(String issueDate) {
		this.issuedDate = issueDate;
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

}
