package com.assignment1.driver;

import com.assignment1.departments.*;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Admin Department Info
		
		AdminDepartment adminObj = new AdminDepartment();
		
		System.out.println("Welcome to "+adminObj.departmentName());
		System.out.println(adminObj.departmentName());
		System.out.println(adminObj.departmentName());
		System.out.println(adminObj.departmentName());
		
		System.out.println(" ");

        //HR Department Info
		
		HRDepartment HRObj = new HRDepartment();
		
		System.out.println("Welcome to "+HRObj.departmentName());
		System.out.println(HRObj.doActivity());
		System.out.println(HRObj.getTodaysWork());
		System.out.println(HRObj.getWorkDeadline());
		System.out.println(HRObj.isTodayAHoliday());
		
		System.out.println(" ");

		
		//Tech Department Info
		
		TechDepartment techObj = new TechDepartment();
		
		System.out.println("Welcome to "+techObj.departmentName());
		System.out.println(techObj.getTodaysWork());
		System.out.println(techObj.getWorkDeadline());
		System.out.println(techObj.getTechStackInformation());
		System.out.println(techObj.isTodayAHoliday());
		

	}

}
