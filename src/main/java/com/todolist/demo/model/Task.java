package com.todolist.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private boolean markAsDone;

	public Task() {

	}

	public Task(Integer id, String name, boolean mark_as_done) {
		this.id=id;
		this.name=name;
		this.markAsDone=mark_as_done;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isMarkAsDone() {
		return markAsDone;
	}

	public void setMarkAsDone(boolean markAsDone) {
		this.markAsDone = markAsDone;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", markAsDone=" + markAsDone + "]";
	}

}
