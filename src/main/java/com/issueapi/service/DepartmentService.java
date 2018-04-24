package com.issueapi.service;

import java.util.List;
import com.issueapi.model.Department;

public interface DepartmentService {
	
	public List<Department> findAll();
	
	public Department findDepartmentById(Integer departmentId);
	
	public boolean createDepartment(Department department);
	
	public boolean removeDepartmentById(Integer departmentId);

	public boolean updateDepartmentById(Department department);
	
}
