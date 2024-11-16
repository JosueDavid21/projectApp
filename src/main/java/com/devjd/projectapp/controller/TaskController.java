package com.devjd.projectapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import com.devjd.projectapp.service.TaskService;
import com.devjd.projectapp.model.Task;

import java.util.List;

/**
* Description: Model class to Task
*
* @CreationDate: 2024-11-16
* @CreationUser: DevJD
* @Version: 1.0
*/

@RestController
@RequestMapping("/task")
@CrossOrigin({ "*" })
public class TaskController {

	@Autowired
	private TaskService taskService;

    @GetMapping("/all")
    public List<Task> getAllTask() {
        return taskService.getAllTask();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id)
            .map(task -> ResponseEntity.ok().body(task))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Task> saveTask(@RequestBody Task task) {
        Task newTask = taskService.saveTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(newTask);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}