package com.taskmanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Adarsh
 *Task Manager Mirco services Component
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TaskmanagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskmanagerServiceApplication.class, args);
	}
}
