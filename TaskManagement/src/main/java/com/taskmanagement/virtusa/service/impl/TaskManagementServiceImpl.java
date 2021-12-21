package com.taskmanagement.virtusa.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.taskmanagement.virtusa.model.Task;
import com.taskmanagement.virtusa.repository.TaskManagementRepository;
import com.taskmanagement.virtusa.service.TaskManagementService;

@Service
public class TaskManagementServiceImpl implements TaskManagementService{

	TaskManagementRepository repo; 
	public TaskManagementServiceImpl(TaskManagementRepository repo) {
		super();
		this.repo = repo;
	}
	@Override
	public List<Task> getAllTasks() {
		return repo.findAll();
	}
	@Override
	@Transactional
	public String deleteTask(int id) {
		repo.deleteAllById(id);
		return "Deleted Succesfully";
	}
	@Override
	public Optional<Task> getById(int id) {
		return repo.findById(id);
	}
    public Task saveTask(Task t)
    {
    	return repo.save(t);
    }
    public Task editTask(Task task, int id) {
		Optional<Task> find=repo.findById(id);
		if(find.isPresent())
		{
			task.setTaskId(task.getTaskId());
			task.setTaskHolderName(task.getTaskHolderName());
			task.setTaskDate(task.getTaskDate());
			task.setTaskName(task.getTaskName());
			task.setTaskStatus(task.getTaskStatus());
			repo.save(task);
		}
		return task;
	}
}
