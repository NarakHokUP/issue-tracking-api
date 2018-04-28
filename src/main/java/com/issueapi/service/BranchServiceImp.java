package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.Branch;
import com.issueapi.repository.BranchRepository;

@Service
public class BranchServiceImp implements BranchService {

	@Autowired
	private BranchRepository branchRepository;

	@Override
	public List<Branch> findAllBranch() {
		System.out.println("API all branches Service-> " + branchRepository.findAllBranch());
		return branchRepository.findAllBranch();
	}

	@Override
	public Branch findBranchById(Integer branchId) {
		for (Branch branch : findAllBranch()) {
			if (branch.getBranchId() == branchId) {
				System.out.println("API Branch findBranchById " + branch);
				return branch;
			}
		}
		return new Branch();
		/*if (branchId ==null) {
			System.out.println("API Branch findBranchById " + branchRepository.findBranchById(branchId));
			return new Branch();
		}
		return branchRepository.findBranchById(branchId);*/
	}

	@Override
	public boolean createBranch(Branch branch) {
		if (branch == null) {
			System.out.println("Please input Branch Information to Create !!!");
			return false;
		}
		boolean createStatus = branchRepository.createBranch(branch);
		System.out.println(createStatus + " Create Branch Successfully.");
		return createStatus;
	}

	@Override
	public boolean removeBranchById(Integer branchId) {
		if (branchId == null) {
			System.out.println("Please input Branch ID to Remove !!!");
			return false;
		}
		boolean removeStatus = branchRepository.removeBranchById(branchId);
		System.out.println(removeStatus + " Remove Branch Successfully.");
		return false;
	}

	@Override
	public boolean updateBranchById(Branch branch) {
		if (branch == null) {
			System.out.println("Please input Branch Information to Update !!!");
			return false;
		}
		boolean updateStatus = branchRepository.updateBranchById(branch);
		System.out.println(updateStatus + " Update Branch Successfully.");
		return updateStatus;
	}

}
