package com.issueapi.service;

import java.util.List;
import com.issueapi.model.Branch;

public interface BranchService {
	public List<Branch> findAllBranch();

	public Branch findBranchById(Integer branchId);

	public boolean createBranch(Branch branch);

	public boolean removeBranchById(Integer branchId);

	public boolean updateBranchById(Branch branch);
}
