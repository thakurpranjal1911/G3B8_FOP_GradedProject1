package com.assignment1.departments;

public class AdminDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		// TODO Auto-generated method stub
		return "Admin Department";
	}

	@Override
	public String getTodaysWork() {
		// TODO Auto-generated method stub
		return "Complete you documents submission";
	}

	@Override
	public String getWorkDeadline() {
		// TODO Auto-generated method stub
		return "Complete by EOD";
	}

}
