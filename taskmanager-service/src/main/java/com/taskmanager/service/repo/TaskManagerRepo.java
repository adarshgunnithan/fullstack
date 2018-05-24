/*
 * (C) Copyright 
 * Author :Adarsh , created on 09-May-2018
 * TaskManagerRepo.java ,
 *
 */

package com.taskmanager.service.repo;

import java.util.Collection;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Component;

import com.taskmanager.service.entities.Task;

/**
 * @author Adarsh
 *
 */
//@RepositoryRestResource
public interface TaskManagerRepo extends JpaRepository<Task, Long> {

	
}