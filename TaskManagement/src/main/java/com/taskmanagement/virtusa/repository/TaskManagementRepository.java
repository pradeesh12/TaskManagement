package com.taskmanagement.virtusa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.taskmanagement.virtusa.model.Task;

@Repository
public interface TaskManagementRepository extends JpaRepository<Task, Integer>{


	String deleteAllById(int id);

}
