/*
 * (C) Copyright 
 * Author :Adarsh , created on 31-May-2018
 * NotifcationService.java ,
 *
 */

package com.common.taskmanager.ne.service;

import com.common.taskmanager.ne.vo.Notification;

/**
 * @author Adarsh
 *API for notification services
 */
public interface NotifcationService {

	public String notify(Notification notification);
}
