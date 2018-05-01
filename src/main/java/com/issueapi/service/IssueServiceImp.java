package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.issueapi.model.Issue;
import com.issueapi.model.IssueApproval;
import com.issueapi.repository.IssueApprovalRepository;
import com.issueapi.repository.IssueRepository;

@Service
public class IssueServiceImp implements IssueService {

	@Autowired
	private IssueRepository issueRepository;
	@Autowired
	private IssueApprovalRepository issueApprovalRepository;
	@Override
	public List<Issue> getAllIssue() {
		return issueRepository.findAll();
	}
	@Override
	public boolean create(Issue issue) {
		
		return issueRepository.save(issue);
	}
	@Transactional
	@Override
	public boolean lineManagerApproval(Issue issue,IssueApproval issueApproval) {
		if(issue==null || issueApproval==null){
			return false;
		}
		boolean lstatus=false,istatus=false;
		istatus=issueRepository.lineManagerApproval(issue);
		if(istatus==true){
			lstatus=issueApprovalRepository.createIssueApproval(issueApproval);
		}
		System.out.println("API Service Approved " + lstatus);
		return lstatus;
	}
	@Override
	public boolean DepartmentManagerApproval(Issue issue,IssueApproval issueApproval) {
		if(issue==null){
			return issueRepository.DepartmentManagerApproval(issue);
		}
		return false;
	}
	@Override
	public boolean LineORDepartmentManagerReject(Issue issue,IssueApproval issueApproval) {
		if(issue==null){
			return false;
		}
		// TODO Auto-generated method stub
		return issueRepository.LineORDepartmentManagerReject(issue);
	}

}
