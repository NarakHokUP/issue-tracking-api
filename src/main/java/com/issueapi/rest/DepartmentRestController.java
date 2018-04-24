package com.issueapi.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/department/{departmentId}")
	public Department findDepartmentById(@PathVariable("departmentId") Integer departmentId){
		
		if(departmentId==null){
			System.out.println("Department not found !!!");
			return new Department();
		}
		System.out.println("Department found-> " + departmentId);
		return departmentService.findDepartmentById(departmentId);
	}
	
	@PostMapping("/department/add")
	public boolean createDepartment(@RequestBody Department department){
		if (department==null){
			System.out.println("Create Department Failed !!!");
			return false;
		}
		System.out.println("Created Department Successfully.");
		return departmentService.createDepartment(department);
	}

	@DeleteMapping("/department/remove/{departmentId}")
	public boolean removeDepartmentById(@PathVariable("departmentId") Integer departmentId) {
		if(departmentId==null){
			System.out.println("Remove Department Failed !!!");
			return false;
		}
		System.out.println("Removed Department Successfully.");
		return departmentService.removeDepartmentById(departmentId);
	}
	
	@PutMapping("/department/update")
	public boolean updateDepartmentById(@RequestBody Department department){
		if(department==null){
			System.out.println("Update Department Failed !!!");
			return false;
		}
		System.out.println("Updated Department Successfully.");
		return departmentService.updateDepartmentById(department);
	}
}
