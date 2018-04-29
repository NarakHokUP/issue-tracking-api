package com.issueapi.service;

import java.util.List;
import com.issueapi.model.IssueApproval;

public interface IssueApprovalService {

	public List<IssueApproval> findAllIssueApproval();
	
	public boolean createIssueApproval(IssueApproval issueApproval);
}
