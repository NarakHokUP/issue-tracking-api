package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.Issue;
import com.issueapi.service.IssueService;

@RestController
@RequestMapping("/api")
public class IssueRestController {
	@Autowired
	private IssueService issueService;

	@GetMapping("/issues")
	public List<Issue> getIssue() {
		List<Issue> issues;

		System.out.println(issueService.getAllIssue());
		return issues = issueService.getAllIssue();
	}
}
