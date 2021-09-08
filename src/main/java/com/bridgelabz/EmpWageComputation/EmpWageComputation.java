package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation {

	private static final int IS_PRESENT_FULL = 1;
	private static final int IS_PRESENT_HALF = 2;

	private int fullTimeWork;
	private int partTimeWork;

	static int Wage_Per_Hour = 20;
	static int max_days =20;
	static int max_hrs = 100;

	EmpWageComputation(int fullTimeWork, int partTimeWork) {

		this.fullTimeWork = fullTimeWork;
		this.partTimeWork = partTimeWork;
	}

	public void empPresence() {
		
		int monthlyWage = 0;
		int totalempHrs = 0;
		int totalFullTimeHrs = 0;
		int totalPartTimeHrs = 0;
		int workingDays = 0;
		
		while (totalempHrs <= max_hrs && workingDays <= max_days) {
			
			workingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3; 
			
			switch (empCheck) {
				case IS_PRESENT_FULL:fullTimeWork+=fullTimeWork;System.out.println("-------------"+"\n"+"Employee is present full time ");break;
				case IS_PRESENT_HALF:partTimeWork+=partTimeWork;System.out.println("-------------"+"\n"+"Employee is present part time " );break;
				default:System.out.println("Employee is Absent");break;
			}
			
			totalFullTimeHrs += fullTimeWork;
			totalPartTimeHrs += partTimeWork;
			totalempHrs = totalempHrs + totalFullTimeHrs + totalPartTimeHrs;
			System.out.println(" Day " + workingDays + ": hours " +totalFullTimeHrs);
			System.out.println(" Day " + workingDays + ": hours " +totalPartTimeHrs);
		}
		monthlyWage= totalempHrs * Wage_Per_Hour;
		System.out.println("Monthly Wage of Employee is " + monthlyWage);
		
	}

	public static void main(String[] args) {

		EmpWageComputation emp1 = new EmpWageComputation(8, 0); //fullTime
		emp1.empPresence();

		EmpWageComputation emp2 = new EmpWageComputation(0, 4); //partTime
		emp2.empPresence();
	}
}
