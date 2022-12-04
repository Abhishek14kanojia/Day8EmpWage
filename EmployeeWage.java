package com.day8EmpWage;

public class EmployeeWage {

	int WagePerHours = 20;
	int FullDayHours = 0;
	int Wage = 0;
	int FullTime = 1;
	int PartTime = 2;
	int PartTimeHours = 0;
	int TotalWage = 0;
	int Monthly_working_Day = 20;
	int Monthly_hours = 100;
	int TotalWorkingHours = 0;
	int totalEmpHours = 0;
	
	public void DailyWage() {
		
		while(totalEmpHours < Monthly_hours && TotalWorkingHours < Monthly_working_Day ) {
		TotalWorkingHours++;
		int empWage = (int)(Math.floor (Math.random()*5)%3);
		switch (empWage) {
		case 1:
			System.out.println("Employee is Present in Full time");
			FullDayHours = 8;
			Wage = WagePerHours * FullDayHours;
			System.out.println("Employee FullTime Wage is : " + Wage);
			TotalWage = TotalWage + Wage;
			totalEmpHours = totalEmpHours + FullDayHours;
			System.out.println("Days : " + TotalWorkingHours + "Hours : " + FullTime);
			break;
		case 2:
			System.out.println("Employee present in Part time");
			PartTime = 4;
			Wage = WagePerHours * PartTime;
			System.out.println("Employee PartTime Wage is : " + Wage);
			TotalWage = TotalWage + Wage;
			totalEmpHours = totalEmpHours + FullDayHours;
			System.out.println("Days : " + TotalWorkingHours + "Hours : " + PartTime);
			break;
		default :
			System.out.println("Employee is Absent");
		}

		
		}		
		
		System.out.println("Total Monthly wage is in Rupees: " + TotalWage);
	}
	
}
