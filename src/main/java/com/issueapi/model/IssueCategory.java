package com.issueapi.model;

public class IssueCategory {
	private int issueCategoryId;
	private String issueDescription;
	private String createBy;
	private String updateBy;
	private String createDate;
	private String updateDate;
	
	
	public IssueCategory() {
		super();
	}


	public IssueCategory(int issueCategoryId, String issueDescription, String createBy, String updateBy,
			String createDate, String updateDate) {
		super();
		this.issueCategoryId = issueCategoryId;
		this.issueDescription = issueDescription;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}


	public int getIssueCategoryId() {
		return issueCategoryId;
	}


	public void setIssueCategoryId(int issueCategoryId) {
		this.issueCategoryId = issueCategoryId;
	}


	public String getIssueDescription() {
		return issueDescription;
	}


	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
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


	@Override
	public String toString() {
		return "IssueCategory [issueCategoryId=" + issueCategoryId + ", issueDescription=" + issueDescription
				+ ", createBy=" + createBy + ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}
	
	

	
}
