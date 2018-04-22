package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.issueapi.model.IssueType;

@Repository
public interface IssueCategoryRepository {

	@Select("SELECT issueTypeId, Description, createBy, updateBy, createDate, updateDate FROM tb_issuetype")
	public List<IssueType> findall();
}
