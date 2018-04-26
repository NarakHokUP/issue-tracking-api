package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import com.issueapi.model.Department;

@Repository
public interface DepartmentRepository {

	@Select("SELECT departmentId, description, code, createBy, updateBy, createDate, updateDate FROM tb_department")
	public List<Department> findAll();

	@Select("SELECT departmentId, description, code, createBy, updateBy, createDate, updateDate FROM tb_department where departmentId=#{departmentId}")
	public Department findDepartmentById(@PathVariable("departmentId") Integer departmentId);

	@Insert("INSERT INTO tb_department(description, code, createBy, updateBy, createDate, updateDate) VALUES (#{description},#{code},#{createBy},#{updateBy},#{createDate},#{updateDate})")
	public boolean createDepartment(Department department);
	
	@Delete("DELETE FROM tb_department WHERE departmentId= #{departmentId}")
	public boolean removeDepartmentById(@PathVariable(value = "departmentId") Integer departmentId);

	@Update("UPDATE tb_department SET description=#{description},code=#{code},createBy=#{createBy},updateBy=#{updateBy},createDate=#{createDate},updateDate=#{updateDate} WHERE departmentId=#{departmentId}")
	public boolean updateDepartmentById(Department department);
}
