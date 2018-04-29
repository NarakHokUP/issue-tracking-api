package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.issueapi.model.Issue;

@Repository
public interface IssueRepository {

	@Select("SELECT issueId, issueTypeId, userId, departmentId, issueName, issueDetail, issuedDate, updateDate, issueStatus FROM tb_issue")
	public List<Issue> findAll();
	
	
@Insert("INSERT INTO tb_issue	(issueId, issueTypeId, userId, departmentId, issueName, issueDetail, issuedDate, updateDate, issueStatus) VALUES (#{issueId}, #{issueTypeId}, #{userId}, #{departmentId}, #{issueName},#{issueDetail}, #{issuedDate}, #{updateDate}, 'P')")
	public boolean save(Issue issue);
	
}



