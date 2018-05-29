/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-May-2018
 * TaskManagerService.java ,
 *
 */

package com.taskmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.service.entities.Task;

/**
 * @author Adarsh
 *Task Manager services -Mock services
 *To Do -replace with actual service logic
 */
@RestController
@RequestMapping("/taskmanager")
public class TaskManagerService {
	// to test simple get request

	/**
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/get-tasks")
	public List<Task> getTasks() {
		List<Task> dummyTasks = new ArrayList<Task>();
		return dummyTasks;
	}

	// to know simple post with a parameter
	/**
	 * @param taskName
	 * @return
	 */
	@RequestMapping(value = "/get-task/{taskName}", method = RequestMethod.GET)
	public Task getTask(@PathVariable("taskName") String taskName) {
		Task dumyTask = new Task();
		dumyTask.setTaskName(taskName);
		return dumyTask;
	}

	/**
	 * @param task
	 * @return
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add-task",consumes = MediaType.APPLICATION_JSON_VALUE,headers = {
    "content-type=application/json" })
	public Task addTask(@RequestBody Task task) {
		//Task addedDummyTask = new Task();
		return task;

	}
}