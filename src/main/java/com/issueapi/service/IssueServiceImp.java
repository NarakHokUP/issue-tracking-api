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
	@Override
	public boolean create(Issue issue) {
		
		return issueRepository.save(issue);
	}
	@Override
	public boolean lineManagerApproval(Issue issue) {
		if(issue==null){
			return false;
		}
		return issueRepository.lineManagerApproval(issue);
	}
	@Override
	public boolean DepartmentManagerApproval(Issue issue) {
		if(issue==null){
			return issueRepository.DepartmentManagerApproval(issue);
		}
		return false;
	}
	@Override
	public boolean LineORDepartmentManagerReject(Issue issue) {
		if(issue==null){
			return false;
		}
		// TODO Auto-generated method stub
		return issueRepository.LineORDepartmentManagerReject(issue);
	}

}
