package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class TechDepartment extends SuperDepartment
{
	public  String departmentName()
	{
		return "Welcome to Tech Department";
		
	}
	public String getTodaysWork()
	{
		return "Complete coding of Module 1";
		
	}
	public String getWorkDeadLine()
	{
		return "Complete by EOD";
	}
	public String getStackInformation()
	{
		return "Core Java";
	}

}
