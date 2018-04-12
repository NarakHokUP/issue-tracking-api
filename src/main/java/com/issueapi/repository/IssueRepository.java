package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.issueapi.model.Issue;

@Repository
public interface IssueRepository {

	@Select("SELECT issueId, categoryId, userId, departmentID, issueName, issueDetail, issuedDate, updateDate, issueStatus FROM tb_issue")
	public List<Issue> findAll();
	
}