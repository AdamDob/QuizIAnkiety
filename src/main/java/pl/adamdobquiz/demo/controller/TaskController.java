package pl.adamdobquiz.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.adamdobquiz.entity.Task;
import pl.adamdobquiz.service.TaskService;

import java.util.Collection;

@RequiredArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskService taskService;

    @GetMapping
    public Collection<Task> findAll() {
        return taskService.findAll();
    }

    @GetMapping("/{id}")
    public Task findTask(@PathVariable String id) {
        return taskService.find(id);
    }

    @PostMapping
    public Task addTask(@RequestBody Task task) {
        return taskService.create(task);
    }

    @PutMapping("/{id}")
    public Task task(@RequestBody Task task, @PathVariable String id) {
        task.setId(id);
        return taskService.update(task);
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable String id) {
        taskService.delete(id);
    }
}
