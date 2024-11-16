package com.devjd.projectapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devjd.projectapp.model.Task;

/**
* Description: Model class to Task
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}