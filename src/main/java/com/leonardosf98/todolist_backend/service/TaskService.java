package com.leonardosf98.todolist_backend.service;

import com.leonardosf98.todolist_backend.model.Task;
import com.leonardosf98.todolist_backend.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask (Task task) {
        return taskRepository.save(task);
    }

}
