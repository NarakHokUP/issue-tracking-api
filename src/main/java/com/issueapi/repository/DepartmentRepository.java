package com.issueapi.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.issueapi.model.Department;;

@Repository
public interface DepartmentRepository {

	@Select("SELECT departmentId, description, code, createBy, updateBy, createDate, updateDate FROM tb_department")
	public List<Department> findAll();

}
