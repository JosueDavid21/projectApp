package com.devjd.projectapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.devjd.projectapp.service.ProjectService;
import com.devjd.projectapp.model.Project;

import java.util.List;

/**
* Description: Model class to Project
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@RestController
@RequestMapping("/project")
@CrossOrigin({ "*" })
public class ProjectController {

	@Autowired
	private ProjectService projectService;

    @GetMapping("/all")
    public List<Project> getAllProject() {
        return projectService.getAllProject();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id)
            .map(project -> ResponseEntity.ok().body(project))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Project> saveProject(@RequestBody Project project) {
        Project newProject = projectService.saveProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }
}