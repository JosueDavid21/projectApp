package com.devjd.projectapp.service;

import com.devjd.projectapp.model.DetailProject;
import com.devjd.projectapp.repository.DetailProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
* Description: Model class to DetailProject
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Service
public class DetailProjectService {

	@Autowired
	private DetailProjectRepository detailProjectRepository;

    public List<DetailProject> getAllDeteailProject() {
        return detailProjectRepository.findAll();
    }

    public Optional<DetailProject> getDetailProjectById(Long id) {
        return detailProjectRepository.findById(id);
    }

    public DetailProject saveDetailProject(DetailProject detailProject) {
        return detailProjectRepository.save(detailProject);
    }

    public void deleteDetailProject(Long id) {
        detailProjectRepository.deleteById(id);
    }
}