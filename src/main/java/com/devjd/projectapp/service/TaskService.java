package com.devjd.projectapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;
import com.devjd.projectapp.model.Task;
import com.devjd.projectapp.repository.TaskRepository;

/**
* Description: Model class to Task
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}