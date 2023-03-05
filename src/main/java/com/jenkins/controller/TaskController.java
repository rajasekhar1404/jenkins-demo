package com.jenkins.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    @GetMapping("/print")
    public String print() {
        return "printing";
    }

    @GetMapping("/task")
    public String getTask() {
        return "Here is the task..";
    }

    @PostMapping("/create")
    public String createTask() {
        return "Task created.";
    }

}
