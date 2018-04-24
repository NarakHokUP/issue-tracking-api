package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.Department;
import com.issueapi.repository.DepartmentRepository;

@Service
public class DepartmentServiceImp implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	@Override
	public Department findDepartmentById(Integer departmentId) {

		for(Department department : findAll()){
			if(department.getDepartmentId()== departmentId)
				return department;
		}
		return new Department();
	}

	@Override
	public boolean createDepartment(Department department) {
		if(department == null){
			return false;
		}
		System.out.println("DB Create Department-> " + department);
		return departmentRepository.createDepartment(department);
	}

	@Override
	public boolean removeDepartmentById(Integer departmentId) {
		if(departmentId ==null){
			return false;
		}
		System.out.println("DB Remove Department-> " + departmentId);
		return departmentRepository.removeDepartmentById(departmentId);
	}

	@Override
	public boolean updateDepartmentById(Department department) {
		if (department==null){
			return false;
		}
		System.out.println("DB Update Department-> " + department);
		return departmentRepository.updateDepartmentById(department);
	}
}
