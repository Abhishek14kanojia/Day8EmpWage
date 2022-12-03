package com.day8EmpWage;

public class EmployeeWage {

	public void Attendance() {
		
		int empAttendance = (int) (Math.random()*5)%2;
		if(empAttendance == 1) {
			System.out.println("Employee is Present");
		}else {
			System.out.println("Employee is Absent");
		}
	
	}
	
}
