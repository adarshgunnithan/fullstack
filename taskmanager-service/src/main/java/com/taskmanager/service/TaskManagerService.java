/*
 * (C) Copyright 
 * Author :Adarsh , created on 19-May-2018
 * TaskManagerService.java ,
 *
 */

package com.taskmanager.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.common.taskmanager.ne.vo.Notification;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
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
	
	@Autowired
    private RestTemplate restTemplate;
   
    @Autowired
    private EurekaClient eurekaClient;

	/**
	 * Method to return all tasks created
	 * @return List<Task>
	 * To Do - acutal implementation replacing mock
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/get-tasks")
	public List<Task> getTasks() {
		List<Task> dummyTasks = new ArrayList<Task>();
		return dummyTasks;
	}

	// to know simple post with a parameter
	/**
	 * Get Task by unique task name
	 * @param taskName
	 * @return Task
	 * To Do - acutal implementation replacing mock
	 */
	@RequestMapping(value = "/get-task/{taskName}", method = RequestMethod.GET)
	public Task getTask(@PathVariable("taskName") String taskName) {
		Task dumyTask = new Task();
		dumyTask.setTaskName(taskName);
		return dumyTask;
	}

	/**
	 * API to add task
	 * @param task
	 * @return Task
	 * To Do - acutal implementation replacing mock
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/add-task",consumes = MediaType.APPLICATION_JSON_VALUE,headers = {
    "content-type=application/json" })
	public Task addTask(@RequestBody Task task) {
		invokeNotification();
		return task;

	}
	
	/**
	 * Method to invoke service using service registry
	 */
	public void invokeNotification(){
		Application application = eurekaClient.getApplication("NOTIFICATION-SERVICE");
	       InstanceInfo instanceInfo = application.getInstances().get(0);
	       String url = "http://"+instanceInfo.getIPAddr()+ ":"+instanceInfo.getPort()+"/notification-service/notify";
	       System.out.println("URL" + url);     
	        Notification notificationMockObject = new Notification();
	       String notificationId = restTemplate.postForObject(url, notificationMockObject, String.class);
	       System.out.println("RESPONSE " + notificationId);
	}
	

}