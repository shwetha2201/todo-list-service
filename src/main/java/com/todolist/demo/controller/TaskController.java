package com.todolist.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.todolist.demo.model.Task;
import com.todolist.demo.service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;

	@PostMapping("/addtask")
	public String addTask(String name) {
		taskService.addTask(name);
		return "task has been added";
	}

	@PutMapping("/edittask")
	public String editTask(int id, String name) {
		taskService.editTask(id, name);
		return "task has been edited";
	}

	@PutMapping("/markasdone")
	public String markAsDone(int id) {
		taskService.markAsDone(id);
		return "task has been marked as done";

	}
	
	@DeleteMapping("/deletetask")
	public String deleteTask(int id) {
		taskService.deleteTask(id);
		return "task has been deleted";
	}

	@GetMapping("/gettask")
	public Task getTask(int id) {
		return taskService.getTask(id);

	}
	
	@GetMapping("/getAllTask")
	public List<Task> getAllTask(){
		return taskService.getAllTask();
		
	}
}
