package com.markos.springbootliquibaseh2.service;

import com.markos.springbootliquibaseh2.entity.Task;
import com.markos.springbootliquibaseh2.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public Task findTask(long id) {
		return taskRepository.findOne(id);
	}

	public Task saveTask(Task task) {
		return taskRepository.save(task);
	}
}
