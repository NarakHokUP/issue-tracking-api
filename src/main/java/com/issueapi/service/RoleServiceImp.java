package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.Role;
import com.issueapi.repository.RoleRepository;
@Service
public class RoleServiceImp implements RoleService{

	@Autowired
	private RoleRepository roleRepository;
	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}
	@Override
	public Role findRoleById(Integer id) {
		for(Role role : getAllRoles()){
			if (role.getRoleid()==id){
				return role;
			}
		}
		return null;
	}
	@Override
	public boolean createRole(Role role) {
		return roleRepository.save(role);
	}
	@Override
	public boolean removeRoleById(Integer id) {
		boolean status=roleRepository.removeRoleById(id);
		if(status ){
			System.out.println("Successful removed role=" + id);
			return status;
		}
		else
			System.out.println("-> Remove Fail!");
			return false;
		/*for(Role role : getAllRoles()){
			if (role.getRoleID()==id){
				return roleRepository.removeRoleById(id);
			}
		}*/
		//return false;
	}
	@Override
	public boolean updateRoleById(Role role) {
		boolean status=roleRepository.updateRoleById(role);
		if (status){
			System.out.println(status + " -> Updated Role Successfully! "+ role.toString() + "");
			return status;
		}
		else
			System.out.println("-> Update Fail!");
		return false;
	}
	

}
