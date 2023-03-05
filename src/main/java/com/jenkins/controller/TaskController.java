package com.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TaskController {

    @GetMapping("/print")
    public String print() {
        return "printing";
    }

    @GetMapping("/task")
    public String getTask() {
        return "Task created.."
    }

}
