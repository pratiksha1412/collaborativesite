package com.niit.collaborationback.dao;

import java.util.List;

import com.niit.collaborationback.model.Job;


public interface JobDAO {
	
	public boolean saveJob(Job job);
	
	public boolean delete(Job job);
	
	public boolean updateJob(Job job);
	
	public Job getJob(String id);
	
	public List<Job> getOpenJobs();
	



}
