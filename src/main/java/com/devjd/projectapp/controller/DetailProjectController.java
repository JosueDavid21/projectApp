package com.devjd.projectapp.controller;

import com.devjd.projectapp.model.DetailProject;
import com.devjd.projectapp.service.DetailProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
* Description: Model class to DetailProject
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@RestController
@RequestMapping("/detail-project")
@CrossOrigin({ "*" })
public class DetailProjectController {

	@Autowired
	private DetailProjectService detailProjectService;

    @GetMapping("/all")
    public List<DetailProject> getAllDeteailProject() {
        return detailProjectService.getAllDeteailProject();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetailProject> getDeteailProjectById(@PathVariable Long id) {
        return detailProjectService.getDetailProjectById(id)
            .map(project -> ResponseEntity.ok().body(project))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetailProject> saveDeteailProject(@RequestBody DetailProject project) {
        DetailProject newProject = detailProjectService.saveDetailProject(project);
        return ResponseEntity.status(HttpStatus.CREATED).body(newProject);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDeteailProject(@PathVariable Long id) {
        detailProjectService.deleteDetailProject(id);
        return ResponseEntity.noContent().build();
    }
}