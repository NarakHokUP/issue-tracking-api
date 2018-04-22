package com.issueapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.issueapi.model.IssueType;
import com.issueapi.repository.IssueCategoryRepository;

@Service
public class IssueTypeServiceImp implements IssueTypeService {
	@Autowired
	private IssueCategoryRepository issueCategoryRepository;

	@Override
	public List<IssueType> findall() {

		return issueCategoryRepository.findall();
	}

}
