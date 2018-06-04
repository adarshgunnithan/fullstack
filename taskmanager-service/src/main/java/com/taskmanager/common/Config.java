/*
 * (C) Copyright 
 * Author :Adarsh , created on 04-Jun-2018
 * Config.java ,
 *
 */

package com.taskmanager.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
/**
 * @author Adarsh
 *Spring Config class
 */
@Configuration
public class Config {
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
