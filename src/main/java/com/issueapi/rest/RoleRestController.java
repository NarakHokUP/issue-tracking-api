package com.issueapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.issueapi.model.Role;
import com.issueapi.service.RoleService;
//@Controller + @ResponseBody
@RestController
public class RoleRestController {

	@Autowired
	private RoleService roleService;
	
	
	@GetMapping("/roles")
	public List<Role> getAllRoles(){
		System.out.println(roleService.getAllRoles());
		return roleService.getAllRoles();
	}
	
	@GetMapping("/roles/{id}")
	public Role getRoleById(@PathVariable Integer  id){
		System.out.println(roleService.findRoleById(id));
		return roleService.findRoleById(id);
	}
	
	@PostMapping("/roles")
	public boolean createRole(@RequestBody Role role){
		 	System.out.println(role);
		 	return roleService.createRole(role);
	
	}
	
	@DeleteMapping("/roles/{id}")
	public boolean removeRoleById(@PathVariable Integer  id){
		System.out.println(id);	
		return roleService.removeRoleById(id);
	}
	@PutMapping("/roles")
	public boolean updateRoleById(@RequestBody Role role){
		 	System.out.println(role.getRoleID());
		 	return roleService.updateRoleById(role);
	
	}
}
