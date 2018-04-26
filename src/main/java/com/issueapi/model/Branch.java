package com.issueapi.model;

public class Branch {
	private int branchId;
	private String branchName;
	private String branchCode;
	private String createBy;
	private String updateBy;
	private String createDate;
	private String updateDate;
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
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
	public Branch(int branchId, String branchName, String branchCode, String createBy, String updateBy,
			String createDate, String updateDate) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public Branch(String branchName, String branchCode, String createBy, String updateBy, String createDate,
			String updateDate) {
		super();
		this.branchName = branchName;
		this.branchCode = branchCode;
		this.createBy = createBy;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public Branch() {
		super();
	}
	@Override
	public String toString() {
		return "Branch [branchId=" + branchId + ", branchName=" + branchName + ", branchCode=" + branchCode
				+ ", createBy=" + createBy + ", updateBy=" + updateBy + ", createDate=" + createDate + ", updateDate="
				+ updateDate + "]";
	}


}
