/*
 * (C) Copyright 
 * Author :Adarsh , created on 31-May-2018
 * NotificationServiceImpl.java ,
 *
 */

package com.common.taskmanager.ne.impl;

import java.util.UUID;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.common.taskmanager.ne.service.NotifcationService;
import com.common.taskmanager.ne.vo.Notification;

/**
 * @author Adarsh
 *NotificationServiceImpl - provides implementation for NE services
 *To Do - need to remove mock implementation
 */
@RestController
@RequestMapping("/notification-service")
public class NotificationServiceImpl implements NotifcationService {
	@RequestMapping(method = RequestMethod.POST, value = "/notify",consumes = MediaType.APPLICATION_JSON_VALUE,headers = {
    "content-type=application/json" })
	@Override
	public String notify(@RequestBody Notification notification) {
		return UUID.randomUUID().toString();// TODO Auto-generated method stub
		
	}

}
