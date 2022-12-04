package com.day8EmpWage;

public class EmployeeWage {

	int WagePerHours = 20;
	int FullDayHours = 0;
	int Wage = 0;
	int FullTime = 1;
	int PartTime = 2;
	int PartTimeHours = 0;
	
	public void DailyWage() {
		
		int empWage = (int)(Math.floor (Math.random()*5)%3);
		if(empWage == FullTime) {
			System.out.println("Employee is Present");
			FullDayHours = 8;
			Wage = FullDayHours * WagePerHours;
			System.out.println("Employee wage is : " + Wage + "Rupees");
		}else if (empWage == PartTime){
			System.out.println("Employee is Present in Part time ");
			PartTimeHours = 4;
			Wage = PartTimeHours * WagePerHours;
			System.out.println("Employee wage is : " + Wage + "Rupees");
		}else {
			System.out.println("Employee is Absent");
			FullDayHours = 0;
			Wage = FullDayHours * WagePerHours;
			System.out.println("Employee wage is : " + Wage + "Rupees");

		}
		

	}
	
}
