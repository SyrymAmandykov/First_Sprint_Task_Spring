package com.example.thymeleaf_layout_dialect.web;

import com.example.thymeleaf_layout_dialect.core.DataBaseManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class TasksController {

    @GetMapping("/tasks")
    public String getAllTasks(Model model){
        model.addAttribute("tasks_list", DataBaseManager.getAllTasks());
        return "tasks";
    }

    @PostMapping("/tasks")
    public String addNewTasks(
            @RequestParam("tasks_name") String name,
            @RequestParam("tasks_description") String description,
            @RequestParam("tasks_deadLine") LocalDateTime deadlineDate,
            @RequestParam("tasks_isCompleted") boolean isCompleted
            ){
        DataBaseManager.addNewTasks(name,description,deadlineDate,isCompleted);
        return "redirect:/tasks";
    }
}
