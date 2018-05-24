package com.taskmanager;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.taskmanager.service.entities.Task;
import com.taskmanager.service.repo.TaskManagerRepo;
/**
 * @author Adarsh
 *
 */

@SpringBootApplication
/*@EnableJpaRepositories ("com.taskmanager.service.repo")
@ComponentScan("com.taskmanager.service")
@EntityScan("com.taskmanager.service.entities")*/

public class TaskmanagerServiceApplication {

	
	/**
	 * test commit
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		SpringApplication.run(TaskmanagerServiceApplication.class, args);
	}
}
