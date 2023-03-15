package com.greatlearning.app;

import com.greatlearning.services.AdminDepartment;
import com.greatlearning.services.HrDepartment;
import com.greatlearning.services.TechDepartment;

public class DriverClass 
{

	public static void main(String[] args) 
	{		
		
		AdminDepartment ad=new AdminDepartment();
		System.out.println("-----------------------------");
		System.out.println(ad.departmentName());
		System.out.println("-----------------------------");
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadLine());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		
		HrDepartment hr=new HrDepartment();
		System.out.println("-----------------------------");
		System.out.println(hr.departmentName());
		System.out.println("-----------------------------");
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadLine());		
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		
		TechDepartment td=new TechDepartment();
		System.out.println("-----------------------------");
		System.out.println(td.departmentName());
		System.out.println("-----------------------------");
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadLine());
		System.out.println(td.getStackInformation());
		System.out.println(td.isTodayAHoliday());
	

	}

}
