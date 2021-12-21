package com.taskmanagement.virtusa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanagement.virtusa.model.Task;
import com.taskmanagement.virtusa.service.impl.TaskManagementServiceImpl;

@RestController
public class TaskManagementController {
	
	TaskManagementServiceImpl call;

	public TaskManagementController(TaskManagementServiceImpl call) {
		super();
		this.call = call;
	}
	@GetMapping("changeStatus/{id}")
	public Task changeStatus(@PathVariable("id") int id,@RequestBody Task t)
	{
		return call.editTask(t,id);
	}
	
	@PostMapping("saveTask")
	public Task saveTask(@RequestBody Task t)
	{
		return call.saveTask(t);
	}
	@GetMapping("/alltasks")
	public List<Task> allTasks()
	{
		return call.getAllTasks();
	}
	
	@GetMapping("/getTask/{id}")
	public Optional<Task> getTask(@PathVariable("id") int id)
	{
		return call.getById(id);
	}
	@DeleteMapping("/deleteTask/{id}")
	public String deleteById(@PathVariable("id") int id)
	{
		return call.deleteTask(id);
	}
}
