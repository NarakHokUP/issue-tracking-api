package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.IssueApproval;
import com.issueapi.repository.IssueApprovalRepository;

@Service
public class IssueApprovalServiceImp implements IssueApprovalService{

	@Autowired
	private IssueApprovalRepository issueApprovalRepository;
	@Override
	public List<IssueApproval> findAllIssueApproval() {
		
		return issueApprovalRepository.findAllIssueApproval();
	}

	@Override
	public boolean createIssueApproval(IssueApproval issueApproval) {
		if(issueApproval==null){
			return false; 
		}
		return issueApprovalRepository.createIssueApproval(issueApproval);
	}

}
