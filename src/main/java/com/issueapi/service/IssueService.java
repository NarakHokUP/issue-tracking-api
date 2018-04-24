package com.issueapi.service;

import java.util.List;

import com.issueapi.model.Issue;

public interface IssueService {
	public List<Issue> getAllIssue();
	
	public boolean create(Issue issue);
}
