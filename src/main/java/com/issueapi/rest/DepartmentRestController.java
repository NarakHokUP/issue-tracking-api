package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.Department;
import com.issueapi.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {
	@Autowired
	private DepartmentService departmentService;
	List<Department> departments;

	@GetMapping("/departments")
	public List<Department> getDepartment() {

		return departments = departmentService.findAll();

	}

}
