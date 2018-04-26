package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Param;

import com.issueapi.model.Role;
import com.issueapi.model.User;

@Repository
public interface UserRepository {
	@Select("SELECT u.userId, b.branchName,d.description department, u.username, u.password,u.username createBy,u.username updateBy, u.createDate, u.updateDate FROM tb_user u inner join tb_department d on d.departmentId=u.departmentId inner join tb_branch b on u.branchId=b.branchId")
	
	@Results({ @Result(property = "userId", column = "userId"),
			@Result(property = "roles", column = "userId", many = @Many(select = "findRoleByuserId")) })

	public List<User> findAll();

	@Select("select u.userId,u.username,u.password from tb_user u where u.username=#{username}")
	@Results({ @Result(property = "userId", column = "userId"),
			@Result(property = "roles", column = "userId", many = @Many(select = "findRoleByuserId")) })
	User loadUserByUsername(String username);

	@Select("SELECT u.userId,u.departmentId, b.branchName,d.description department, u.username, u.password,u.username createBy,u.username updateBy, u.createDate, u.updateDate FROM tb_user u inner join tb_department d on d.departmentId=u.departmentId inner join tb_branch b on u.branchId=b.branchId where u.userId=#{userId}")
	@Results({ @Result(property = "userId", column = "userId"),
			@Result(property = "roles", column = "userId", many = @Many(select = "findRoleByuserId")) })
	public User findUserById(Integer userId);

	@Select("select r.roleId,r.role from tb_user_role ur inner join tb_role r on r.roleId=ur.roleId where ur.userId=#{userId}")
	List<Role> findRoleByuserId(int userId);

	@Insert("INSERT INTO tb_user(branchId, departmentId, username, password,createBy,updateBy,createDate,updateDate) VALUES (#{branchId}, #{departmentId},#{username}, #{password},#{createBy},#{updateBy},#{createDate},#{updateDate})")
	@SelectKey(before = false, statement = "SELECT LAST_INSERT_ID()", keyColumn = "userId", keyProperty = "userId", resultType = Integer.class)
	public boolean saveUser(User user);

	@Insert("insert into tb_user_role(userId, roleId) values(#{userId}, #{roleId})")
	public boolean saveUserRole(@Param("userId") Integer userId, @Param("roleId") Integer roleId);

	@Delete("DELETE FROM tb_user WHERE userId =#{userId}")
	public boolean deleteUserByUserId(@Param(value = "userId") Integer userId);

	@Delete("DELETE FROM tb_user_role WHERE userId =#{userId}")
	public boolean deleteUserRoleByUserId(@Param(value = "userId") Integer userId);

	@Update("UPDATE tb_user SET branchId=#{branchId},departmentId=#{departmentId},username=#{username},password=#{password},createBy=#{createBy},updateBy=#{updateBy},createDate=#{createDate},updateDate=#{updateDate} WHERE userId=#{userId}")
	public boolean updateUserByUserId(User user);
}