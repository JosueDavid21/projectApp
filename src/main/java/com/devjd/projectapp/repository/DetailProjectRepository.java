package com.devjd.projectapp.repository;

import com.devjd.projectapp.model.DetailProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
* Description: Model class to DetailProject
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Repository
public interface DetailProjectRepository extends JpaRepository<DetailProject, Long> {
}