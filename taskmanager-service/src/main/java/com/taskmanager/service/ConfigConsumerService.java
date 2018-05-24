/*
 * (C) Copyright 
 * Author :Adarsh , created on 24-May-2018
 * ConfigConsumerService.java ,
 *
 */

package com.taskmanager.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigConsumerService {
	 @Value("${message}")
	private String message;

	@RefreshScope
	@RequestMapping("/message")
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
