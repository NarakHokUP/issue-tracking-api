package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.issueapi.model.Issue;

import retrofit2.http.PUT;

@Repository
public interface IssueRepository {

	@Select("SELECT i.issueId, i.issueTypeId,i.userId, u.username,i.departmentId, d.Description, i.issueName, i.issueDetail, i.issuedDate, i.updateDate, i.issueStatus FROM tb_issue i inner join tb_user u on i.userId=u.userId inner join tb_department d on d.departmentId=i.departmentId")
	public List<Issue> findAll();
	@Select("SELECT i.issueId, i.issueTypeId,i.userId, u.username,i.departmentId, d.Description, i.issueName, i.issueDetail, i.issuedDate, i.updateDate, i.issueStatus FROM tb_issue i inner join tb_user u on i.userId=u.userId inner join tb_department d on d.departmentId=i.departmentId where i.issueId=#{issueId}")
	public Issue findIssueById(@PathVariable Integer issueId);

	@Insert("INSERT INTO tb_issue	(issueId, issueTypeId, userId, departmentId, issueName, issueDetail, issuedDate, updateDate, issueStatus) VALUES (#{issueId}, #{issueTypeId}, #{userId}, #{departmentId}, #{issueName},#{issueDetail}, #{issuedDate}, #{updateDate}, 'P')")
	public boolean save(Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean lineManagerApproval(@RequestBody Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean DepartmentManagerApproval(@RequestBody Issue issue);

	@PUT("UPDATE tb_issue SET issueStatus=#{issueStatus} WHERE issueId=#{issueId}")
	public boolean LineORDepartmentManagerReject(@RequestBody Issue issue);
}
