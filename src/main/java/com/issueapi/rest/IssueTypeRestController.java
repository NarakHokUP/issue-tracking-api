package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.IssueType;
import com.issueapi.service.IssueTypeService;

@RestController
@RequestMapping("/api")
public class IssueTypeRestController {
	@Autowired
	private IssueTypeService issueCategoryService;
	List<IssueType> issueCategories;

	@GetMapping("/issueType")
	public List<IssueType> getIssueCategory() {

		return issueCategories = issueCategoryService.findall();

	}

}
