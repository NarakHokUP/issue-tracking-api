package com.issueapi.model;

public class IssueApproval {
	private int issueId;
	private int userId;
	private String approve;
	private String comment;
	private String approvedDate;
	private int assignedToUserId;
	public int getIssueId() {
		return issueId;
	}
	public void setIssueId(int issueId) {
		this.issueId = issueId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getApprove() {
		return approve;
	}
	public void setApprove(String approve) {
		this.approve = approve;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
	}
	public int getAssignedToUserId() {
		return assignedToUserId;
	}
	public void setAssignedToUserId(int assignedToUserId) {
		this.assignedToUserId = assignedToUserId;
	}
	@Override
	public String toString() {
		return "IssueApproval [issueId=" + issueId + ", userId=" + userId + ", approve=" + approve + ", comment="
				+ comment + ", approvedDate=" + approvedDate + ", assignedToUserId=" + assignedToUserId + "]";
	}
	public IssueApproval(int issueId, int userId, String approve, String comment, String approvedDate,
			int assignedToUserId) {
		super();
		this.issueId = issueId;
		this.userId = userId;
		this.approve = approve;
		this.comment = comment;
		this.approvedDate = approvedDate;
		this.assignedToUserId = assignedToUserId;
	}
	public IssueApproval(int userId, String approve, String comment, String approvedDate, int assignedToUserId) {
		super();
		this.userId = userId;
		this.approve = approve;
		this.comment = comment;
		this.approvedDate = approvedDate;
		this.assignedToUserId = assignedToUserId;
	}
	public IssueApproval() {
		super();
	}
	 
}
