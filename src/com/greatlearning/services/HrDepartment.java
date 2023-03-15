package com.greatlearning.services;

import com.greatlearning.model.SuperDepartment;

public class HrDepartment extends SuperDepartment
{
	public  String departmentName()
	{
		return "Welcome to HR Department";
		
	}
	public String getTodaysWork()
	{
		return "Fill today's timesheet and mark the attendance";
		
	}
	public String getWorkDeadLine()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "Team Lunch";
	}

}
