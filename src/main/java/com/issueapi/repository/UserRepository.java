package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


import com.issueapi.model.User;

@Repository
public interface UserRepository {
	@Select("SELECT userID, branchID, roleID, userName, password, createBy, updateBy, createDate, updateDate\r\n" + 
			"	FROM tb_user")
	public List<User> findAll();
}
