package com.day8EmpWage;

public class EmployeeWage {

	int WagePerHours = 20;
	int FullDayHours = 0;
	int Wage = 0;
	int FullTime = 1;
	
	public void DailyWage() {
		
		int empWage = (int)(Math.floor (Math.random()*5)%2);
		if(empWage == FullTime) {
			System.out.println("Employee is Present");
			FullDayHours = 8;
			Wage = FullDayHours * WagePerHours;
		}else {
			System.out.println("Employee is Absent");
			FullDayHours = 0;
			Wage = FullDayHours * WagePerHours;
		}
		
		System.out.println("Employee wage is : " + Wage + "Rupees");

	}
	
}
