package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class AdminDepartment extends SuperDepartment
{
	public  String departmentName()
	{
		
		return "Welcome to Admin Department";
		
	}
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
		
	}
	public String getWorkDeadLine()
	{
		return "Complete by EOD";
	}

}
