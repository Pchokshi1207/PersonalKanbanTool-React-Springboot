package com.springboot.io.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.io.domain.Project;
import com.springboot.io.exceptions.ProjectIdException;
import com.springboot.io.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	public Project saveOrUpdateProject(Project project) {
		try {
			project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
			return projectRepository.save(project);
		}catch(Exception e) {
			throw new ProjectIdException("Project Id'"+project.getProjectIdentifier().toUpperCase()+"'already exist");
		}
		
	}

}
