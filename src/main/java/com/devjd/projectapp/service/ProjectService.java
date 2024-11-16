package com.devjd.projectapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import com.devjd.projectapp.model.Project;
import com.devjd.projectapp.repository.ProjectRepository;

/**
* Description: Model class to Project
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Service
public class ProjectService {

	@Autowired
	private ProjectRepository projectRepository;

    public List<Project> getAllProject() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}