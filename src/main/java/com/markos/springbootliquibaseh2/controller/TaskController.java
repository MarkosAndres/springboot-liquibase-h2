package com.markos.springbootliquibaseh2.controller;

import com.markos.springbootliquibaseh2.entity.Task;
import com.markos.springbootliquibaseh2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task")
public class TaskController {

	@Autowired
	private TaskService taskService;

	@GetMapping("/{id}")
	public Task findTask(@PathVariable long id) {
		return taskService.findTask(id);
	}

	@PostMapping
	public Task saveTask(@RequestBody Task task) {
		return taskService.saveTask(task);
	}
}
