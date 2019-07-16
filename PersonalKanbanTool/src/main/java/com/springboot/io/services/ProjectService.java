package com.springboot.io.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.io.domain.Project;
import com.springboot.io.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	public Project saveOrUpdateProject(Project project) {
		return projectRepository.save(project);
	}

}
