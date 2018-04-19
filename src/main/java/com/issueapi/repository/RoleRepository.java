package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.issueapi.model.Role;

@Repository
public interface RoleRepository {
	@Select("select * from tb_role")
	public List<Role> findAll();
	
	@Select("select * from tb_role where roleid=#{id}")
	public Role findRoleById(Integer id);
	
	@Insert("INSERT INTO `tb_role`( `role`,`createby`, `updateby`, `createdate`, `updatedate`) "
			+ "VALUES (#{role},#{createby}, #{updateby}, #{createdate}, #{updatedate})")
	public boolean save(Role role);

	@Delete("DELETE FROM `tb_role` WHERE `roleid`= #{id}")
	public boolean removeRoleById(Integer id);
	
	@Update("UPDATE `tb_role` SET `roleid`=#{roleid},`role`=#{role},"
			+ "`createby`=#{createby},`updateby`=#{updateby},`createdate`=#{createdate},"
			+ "`updatedate`=#{updatedate} WHERE `roleid`= #{roleid}")
	public boolean updateRoleById(Role role);
}

