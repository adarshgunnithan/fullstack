/*
 * (C) Copyright 
 * Author :Adarsh , created on 09-May-2018
 * TaskManagerRepo.java ,
 *
 */

package com.taskmanager.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taskmanager.service.entities.Task;

/**
 * @author Adarsh
 *
 */
//@RepositoryRestResource
/**
 * @author Adarsh
 *Repo using spring JPA //yet to dos
 */
public interface TaskManagerRepo extends JpaRepository<Task, Long> {

	
}