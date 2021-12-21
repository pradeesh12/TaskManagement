package com.taskmanagement.virtusa.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Task {
	
	@Id
	private int id;
	private int taskId;
	private String taskHolderName;
	private String taskDate;
	private String taskName;
	private String taskStatus;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Task(int id, int taskId, String taskHolderName, String taskDate, String taskName, String taskStatus) {
		super();
		this.id = id;
		this.taskId = taskId;
		this.taskHolderName = taskHolderName;
		this.taskDate = taskDate;
		this.taskName = taskName;
		this.taskStatus = taskStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskHolderName() {
		return taskHolderName;
	}
	public void setTaskHolderName(String taskHolderName) {
		this.taskHolderName = taskHolderName;
	}
	public String getTaskDate() {
		return taskDate;
	}
	public void setTaskDate(String taskDate) {
		this.taskDate = taskDate;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskStatus() {
		return taskStatus;
	}
	public void setTaskStatus(String taskStatus) {
		this.taskStatus = taskStatus;
	}
	
}
