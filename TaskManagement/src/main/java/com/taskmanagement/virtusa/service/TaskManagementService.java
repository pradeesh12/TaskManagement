package com.taskmanagement.virtusa.service;

import java.util.List;
import java.util.Optional;

import com.taskmanagement.virtusa.model.Task;

public interface TaskManagementService 
{
	List<Task> getAllTasks();
	String deleteTask(int id);
	Optional<Task> getById(int id);
	Task saveTask(Task t);
	Task editTask(Task task, int id);
}
