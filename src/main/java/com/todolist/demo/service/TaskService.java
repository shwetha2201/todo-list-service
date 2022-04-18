package com.todolist.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.demo.model.Task;
import com.todolist.demo.repository.TaskRepository;

@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;

	public void addTask(String name) {
		Task t = new Task(null, name, false);
		taskRepository.save(t);

	}

	public void editTask(int id, String name) {
		Task task = taskRepository.findById(id).get();
		task.setName(name);
		taskRepository.save(task);

	}

	public void markAsDone(int id) {
		Task task = taskRepository.findById(id).get();
		task.setMarkAsDone(true);
		taskRepository.save(task);

	}

	public void deleteTask(int id) {
		Task task = taskRepository.findById(id).get();
		taskRepository.delete(task);

	}

	public Task getTask(int id) {
		Task task = taskRepository.findById(id).get();
		return task;
	}

	public List<Task> getAllTask() {
		return taskRepository.findAll();

	}
}
