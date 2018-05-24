/*
 * (C) Copyright 
 * Author :Adarsh , created on 08-May-2018
 * Task.java ,
 *
 */

package com.taskmanager.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Adarsh
 * Task Object model
 */
@Entity
public class Task {

	@Id
	@GeneratedValue
	private Long id;
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Task(String n) {
		// TODO Auto-generated constructor stub
		this.taskName=n;
	}

	private String taskName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", taskName=" + taskName + "]";
	}
	
	
}
