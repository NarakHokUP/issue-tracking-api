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
import com.issueapi.model.Role;
import com.issueapi.service.DepartmentService;
import com.issueapi.service.IssueService;

@RestController
@RequestMapping("/api")
public class IssueRestController {
	@Autowired
	private IssueService issueService;
	@Autowired
	private DepartmentService departmentService;

	@GetMapping("/issues")
	public List<Issue> getIssue() {
		List<Issue> issues;

		System.out.println(issueService.getAllIssue());
		return issues = issueService.getAllIssue();
	}
	
	@PostMapping("/issues")
	public boolean createIssue(@RequestBody Issue issue){
		 	System.out.println(issue);
		 	return issueService.create(issue);	
	}
	
	@PutMapping("/lineapprove")
	public boolean lineManagerApproval(Issue issue,IssueApproval issueApproval){
		if(issue==null){
			return false;
		}
		return issueService.lineManagerApproval(issue,issueApproval);
	}
	@PutMapping("/departmentapprove")
	public boolean DepartmentManagerApproval(Issue issue,IssueApproval issueApproval){
		if(issue==null){
			return false;
		}
		return issueService.DepartmentManagerApproval(issue, issueApproval);
	}
	@PutMapping("/rejectapprove")
	public boolean LineORDepartmentManagerReject(Issue issue,IssueApproval issueApproval){
		if(issue==null){
			return false;
		}
		return issueService.LineORDepartmentManagerReject(issue,issueApproval);
	}
	
}
