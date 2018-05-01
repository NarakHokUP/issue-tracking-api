package com.issueapi.service;

import java.util.List;
import com.issueapi.model.Issue;
import com.issueapi.model.IssueApproval;

public interface IssueService {

	public List<Issue> getAllIssue();
	
	public Issue findIssueById(Integer issueId);

	public boolean create(Issue issue);

	public boolean lineManagerApproval(Issue issue,IssueApproval issueApproval);

	public boolean DepartmentManagerApproval(Issue issue,IssueApproval issueApproval);

	public boolean LineORDepartmentManagerReject(Issue issue,IssueApproval issueApproval);
}
