package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation2 {

	private static final int IS_PRESENT_FULL = 1;
	private static final int IS_PRESENT_HALF = 2;

	private int fullTimeWork;
	private int partTimeWork;
	private int wagePerHr;
	private int maxDays;
	private int maxHrs;

	EmpWageComputation2(int fullTimeWork, int partTimeWork, int wagePerHr, int maxDays, int maxHrs) {
		this.fullTimeWork = fullTimeWork;
		this.partTimeWork = partTimeWork;
		this.wagePerHr = wagePerHr;
		this.maxDays = maxDays;
		this.maxHrs = maxHrs;
	}

	public void empCompute() {

		int monthlyWage = 0, totalempHrs = 0, totalFullTimeHrs = 0, totalPartTimeHrs = 0, workingDays = 0;

		while (totalempHrs <= maxHrs && workingDays <= maxDays) {
			workingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
			case IS_PRESENT_FULL:
				fullTimeWork += fullTimeWork;
				System.out.println("-------------" + "\n" + "Employee is present full time ");
				break;
			case IS_PRESENT_HALF:
				partTimeWork += partTimeWork;
				System.out.println("-------------" + "\n" + "Employee is present part time ");
				break;
			default:
				System.out.println("Employee is Absent");
				break;
			}

			totalFullTimeHrs += fullTimeWork;
			totalPartTimeHrs += partTimeWork;
			totalempHrs = totalempHrs + totalFullTimeHrs + totalPartTimeHrs;
			System.out.println(" Day " + workingDays + ": hours " + totalFullTimeHrs);
			System.out.println(" Day " + workingDays + ": hours " + totalPartTimeHrs);
		}
		monthlyWage = totalempHrs * wagePerHr;
		System.out.println("Monthly Wage of Employee is " + monthlyWage);
	}

	public static void main(String[] args) {

		EmpWageComputation2 emp1 = new EmpWageComputation2(8, 0, 20, 25, 100);
		emp1.empCompute();
	}
}
