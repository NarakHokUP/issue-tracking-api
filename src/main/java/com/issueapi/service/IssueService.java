package com.issueapi.service;

import java.util.List;
import com.issueapi.model.Issue;

public interface IssueService {

	public List<Issue> getAllIssue();

	public boolean create(Issue issue);

	public boolean lineManagerApproval(Issue issue);

	public boolean DepartmentManagerApproval(Issue issue);

	public boolean LineORDepartmentManagerReject(Issue issue);
}
