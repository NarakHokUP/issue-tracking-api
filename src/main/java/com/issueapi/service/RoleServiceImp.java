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
			if (role.getRoleID()==id){
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
	public void removeRoleById(Integer id) {
		if( roleRepository.removeRoleById(id))
			System.out.println("Successful removed role=" + id);
		else
			System.out.println("-> Remove Fail!");
		/*for(Role role : getAllRoles()){
			if (role.getRoleID()==id){
				return roleRepository.removeRoleById(id);
			}
		}*/
		//return false;
	}
	@Override
	public void updateRoleById(Role role) {
		if (roleRepository.updateRoleById(role))
			System.out.println("-> Updated Role Successfully! "+ role.toString() + "");
		else
			System.out.println("-> Update Fail!");
	}
	

}
