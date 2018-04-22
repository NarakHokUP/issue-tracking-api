package com.issueapi.model;

public class IssueType {
	private int issueTypeId;
	private String description;
	private String createBy;
	private String updateBy;
	private String createDate;
	private String updateDate;

	public IssueType() {
		super();
	}

	public IssueType(int issueCategoryId, String issueDescription, String createBy, String updateBy, String createDate,
			String updateDate) {
		super();
		this.issueTypeId = issueCategoryId;
		this.description = issueDescription;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getIssueTypeId() {
		return issueTypeId;
	}

	public void setIssueTypeId(int issueTypeId) {
		this.issueTypeId = issueTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "IssueType [issueTypeId=" + issueTypeId + ", description=" + description + ", createBy=" + createBy
				+ ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
