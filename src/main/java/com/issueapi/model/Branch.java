package com.issueapi.model;

public class Branch {
	private int branchID;
	private String branchName;
	private String branchCode;
	private String createBy;
	private String updateBy;
	private String createDate;
	private String updateDate;

	public Branch() {
		super();
	}

	public Branch(int branchID, String branchName, String branchCode, String createBy, String updateBy,
			String createDate, String updateDate) {
		super();
		this.branchID = branchID;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
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
		return "Branch [branchID=" + branchID + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", createBy=" + createBy + ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}

}
