package com.leonardosf98.todolist_backend.service;

import com.leonardosf98.todolist_backend.model.Task;
import com.leonardosf98.todolist_backend.repository.TaskRepository;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public Task createTask (Task task) {
        return taskRepository.save(task);
    }

    public List<Task> listAllTasks(){
        return taskRepository.findAll();
    }

    public ResponseEntity<Task> getTaskById(Long id){
        return taskRepository.findById(id)
                .map(task -> ResponseEntity.ok().body(task))
                .orElse(ResponseEntity.notFound().build());
    }
}
