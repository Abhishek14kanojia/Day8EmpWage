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
	
		switch (empWage) {
		case 1:
			System.out.println("Employee is Present in Full time");
			FullDayHours = 8;
			Wage = WagePerHours * FullDayHours;
			System.out.println("Employee FullTime Wage is : " + Wage);

			break;
		case 2:
			System.out.println("Employee present in Part time");
			PartTime = 4;
			Wage = WagePerHours * PartTime;
			System.out.println("Employee PartTime Wage is : " + Wage);
			break;
		default :
			System.out.println("Employee is Absent");
		}
		

	}
	
}
