package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.issueapi.model.Issue;

import retrofit2.http.PUT;

@Repository
public interface IssueRepository {

	@Select("SELECT issueId, categoryId, userId, departmentId, issueName, issueDetail, issuedDate, updateDate, issueStatus FROM tb_issue")
	public List<Issue> findAll();

	@Insert("INSERT INTO tb_issue	(issueId, categoryId, userId, departmentId, issueName, issueDetail, issuedDate, updateDate, issueStatus) VALUES (#{issueId}, #{categoryId}, #{userId}, #{departmentId}, #{issueName},#{issueDetail}, #{issuedDate}, #{updateDate}, #{issueStatus})")
	public boolean save(Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean lineManagerApproval(@RequestBody Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean DepartmentManagerApproval(@RequestBody Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean LineORDepartmentManagerReject(@RequestBody Issue issue);
}
