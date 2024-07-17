package com.leonardosf98.todolist_backend.controller;

import com.leonardosf98.todolist_backend.model.Task;
import com.leonardosf98.todolist_backend.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        return taskService.createTask(task);
    }


}
