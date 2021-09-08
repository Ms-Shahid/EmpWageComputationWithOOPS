package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation {

	private static final int IS_PRESENT_FULL = 1;
	private static final int IS_PRESENT_HALF = 2;

	private int fullTimeWork;
	private int partTimeWork;

	private int dailyWage;
	static int Wage_Per_Hour = 20;

	EmpWageComputation(int fullTimeWork, int partTimeWork) {

		this.fullTimeWork = fullTimeWork;
		this.partTimeWork = partTimeWork;
	}

	public void empPresence() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {
		case IS_PRESENT_FULL:
			dailyWage = fullTimeWork * Wage_Per_Hour;
			System.out.println("Employee is present full time and Daily wage is :" + dailyWage);
			break;

		case IS_PRESENT_HALF:
			dailyWage = partTimeWork * Wage_Per_Hour;
			System.out.println("Employee is present part time and Daily wage is :" + dailyWage);
			break;

		default:
			System.out.println("Employee is Absent");
			break;
		}
	}

	public static void main(String[] args) {

		EmpWageComputation emp1 = new EmpWageComputation(8, 0);
		emp1.empPresence();

		EmpWageComputation emp2 = new EmpWageComputation(0, 4);
		emp2.empPresence();

	}
}
