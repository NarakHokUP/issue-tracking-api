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
	@Select("SELECT userId, branchId, username, password, createBy, updateBy, createDate, updateDate" + 
			" FROM tb_user")
	@Results({
		@Result(property="userId", column="userId"),
		@Result(property="roles", column="userId",many =@Many(select="findRoleByuserId"))
	})
	
	public List<User> findAll();
	
	@Select("select u.userId,u.username,u.password from tb_user u where u.username=#{username}")	
	@Results({
				@Result(property="userId",column="userId"),
				@Result(property="roles",column="userId" , many=@Many(select="findRoleByuserId"))
		})
	User loadUserByUsername(String username);
	
	@Select("SELECT userId, branchId, username, password, createBy, updateBy, createDate, updateDate" + 
			" FROM tb_user where userId=#{userId}")
	@Results({
		@Result(property="userId", column="userId"),
		@Result(property="roles", column="userId",many =@Many(select="findRoleByuserId"))
	})
	public User findUserById(Integer userId);
	
	@Select("select r.roleId,r.role from tb_user_role ur inner join tb_role r on r.roleId=ur.roleId where ur.userId=#{userId}")
	List<Role> findRoleByuserId(int userId);
	
}
