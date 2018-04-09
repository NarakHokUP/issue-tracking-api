package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Many;

import com.issueapi.model.Role;
import com.issueapi.model.User;

@Repository
public interface UserRepository {
	@Select("SELECT userID, branchID, username, password, createBy, updateBy, createDate, updateDate" + 
			" FROM tb_user")
	public List<User> findAll();
	
	@Select("select u.userID,u.username,u.password from tb_user u where u.username=#{username}")	
	@Results({
		@Result(property="roles",column="userID" , many=@Many(select="findRoleByUserId"))
		})
	User loadUserByUsername(String username);
	
	@Select("select r.roleID,r.role from tb_user_role ur inner join tb_role r on r.roleID=ur.roleID where ur.userID=#{userID}")
	List<Role> findRoleByUserId(int userID);
}
