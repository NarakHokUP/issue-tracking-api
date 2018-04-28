package com.issueapi.repository;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import com.issueapi.model.Branch;

@Repository
public interface BranchRepository {
	@Select("SELECT b.branchId, b.branchName, b.branchCode, u.username createBy,u.username updateBy, b.createDate, b.updateDate FROM tb_branch b inner join tb_user u on b.createBy=u.userId order by b.branchId")
	public List<Branch> findAllBranch();

	@Select("SELECT b.branchId, b.branchName, b.branchCode, b.createBy, b.updateBy, b.createDate, b.updateDate FROM tb_branch b where branchId=#{branchId}")
	public Branch findBranchById(@PathVariable("branchId") Integer branchId);

	@Insert("INSERT INTO tb_branch( branchName, branchCode, createBy, updateBy, createDate, updateDate) VALUES (#{branchName}, #{branchCode}, #{createBy}, #{updateBy}, #{createDate}, #{updateDate})")
	public boolean createBranch(Branch branch);
	
	@Delete("DELETE FROM tb_branch WHERE branchId=#{branchId}")
	public boolean removeBranchById(@PathVariable(value = "branchId") Integer branchId);

	@Update("UPDATE tb_branch SET branchName=#{branchName},branchCode=#{branchCode},createBy=#{createBy},updateBy=#{updateBy},createDate=#{createDate},updateDate=#{updateDate} WHERE branchId=#{branchId}")
	public boolean updateBranchById(Branch branch);
}
