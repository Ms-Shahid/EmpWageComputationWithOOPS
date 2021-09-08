package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation {

	private static final int IS_PRESENT_FULL = 1;
	private static final int IS_PRESENT_HALF = 2;

	private int fullTimeWork;
	private int partTimeWork;

	private int dailyWage;
	static int Wage_Per_Hour = 20;
	static int max_days =20;

	EmpWageComputation(int fullTimeWork, int partTimeWork) {

		this.fullTimeWork = fullTimeWork;
		this.partTimeWork = partTimeWork;
	}

	public void empPresence() {
		
		int monthlyWage = 0;
		for(int day=0; day<max_days;day++) {
			
			int empCheck = (int) Math.floor(Math.random() * 10) % 3; 
			
			switch (empCheck) {
				case IS_PRESENT_FULL:dailyWage = fullTimeWork * Wage_Per_Hour;System.out.println("-------------"+"\n"+"Employee is present full time ");break;
				case IS_PRESENT_HALF:dailyWage = partTimeWork * Wage_Per_Hour;System.out.println("-------------"+"\n"+"Employee is present part time " );break;
				default:System.out.println("Employee is Absent");break;
			}
			monthlyWage += dailyWage;
		}
		System.out.println("Montly wage of Employee is " + monthlyWage);
	}

	public static void main(String[] args) {

		EmpWageComputation emp1 = new EmpWageComputation(8, 0); //fullTime
		emp1.empPresence();

		EmpWageComputation emp2 = new EmpWageComputation(0, 4); //partTime
		emp2.empPresence();

	}
}
