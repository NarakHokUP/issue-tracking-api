package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.Issue;
import com.issueapi.repository.IssueRepository;

@Service
public class IssueServiceImp implements IssueService {

	@Autowired
	private IssueRepository issueRepository;
	@Override
	public List<Issue> getAllIssue() {
		return issueRepository.findAll();
	}

}
