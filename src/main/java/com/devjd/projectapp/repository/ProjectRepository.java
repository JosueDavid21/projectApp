package com.devjd.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devjd.projectapp.model.Project;

/**
* Description: Model class to Project
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}