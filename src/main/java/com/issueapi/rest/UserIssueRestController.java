package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.Issue;
import com.issueapi.model.IssueApproval;
import com.issueapi.service.IssueApprovalService;

@RestController
@RequestMapping("/api")
public class UserIssueRestController {

	@Autowired
	private IssueApprovalService issueApprovalServiceImp;

	@GetMapping("/issueapproval")
	public List<IssueApproval> findAllIssueApproval() {

		return issueApprovalServiceImp.findAllIssueApproval();
	}

	@PostMapping("/issueapproval")
	public boolean createIssueApproval(@RequestBody IssueApproval issueApproval) {
		if (issueApproval == null) {
			return false;
		}
		return issueApprovalServiceImp.createIssueApproval(issueApproval);
	}
	
}
