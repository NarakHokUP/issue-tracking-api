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

import com.issueapi.model.Branch;
import com.issueapi.service.BranchService;

@RestController
@RequestMapping("/api")
public class BranchController {

	@Autowired
	private BranchService branchService;
	List<Branch> branches=null;

	@GetMapping("/branch")
	public List<Branch> findAllBranch() {
		System.out.println("API Controller branches->" +  branchService.findAllBranch());
		return  branchService.findAllBranch();
	}
	
	@GetMapping("/branch/{branchId}")
	public Branch findBranchById(@PathVariable("branchId") Integer branchId){
		
		if(branchId==null){
			System.out.println("Branch not found !!!");
			return new Branch();
		}
		System.out.println("Branch found-> " + branchId);
		return branchService.findBranchById(branchId);
	}
	
	@PostMapping("/branch/add")
	public boolean createBranch(@RequestBody Branch branch){
		if (branch==null){
			System.out.println("Create Branch Failed !!!");
			return false;
		}
		System.out.println("Created Branch Successfully.");
		return branchService.createBranch(branch);
	}

	@DeleteMapping("/branch/remove/{branchId}")
	public boolean removeBranchById(@PathVariable("branchId") Integer branchId) {
		if(branchId==null){
			System.out.println("Remove Branch Failed !!!");
			return false;
		}
		System.out.println("Removed Branch Successfully.");
		return branchService.removeBranchById(branchId);
	}
	
	@PutMapping("/branch/edit")
	public boolean updateBranchById(@RequestBody Branch branch){
		if(branch==null){
			System.out.println("Update Branch Failed !!!");
			return false;
		}
		System.out.println("Updated Branch Successfully.");
		return branchService.updateBranchById(branch);
	}
}
