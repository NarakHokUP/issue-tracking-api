package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.issueapi.model.IssueApproval;

@Repository
public interface IssueApprovalRepository {
	@Select("SELECT * FROM tb_issueapproval")
	public List<IssueApproval> findAllIssueApproval();
	
	@Insert("INSERT INTO tb_issueapproval(userId, issueId, approve, comment, approvedDate, assignedToUserId) VALUES (#{userId}, #{issueId}, #{approve}, #{comment}, #{approvedDate}, #{assignedToUserId})")
	public boolean createIssueApproval(IssueApproval issueApproval);
	
}
