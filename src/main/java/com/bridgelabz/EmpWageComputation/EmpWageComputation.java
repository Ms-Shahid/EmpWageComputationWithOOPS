package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation {
	
	private int fullTimePresent;
	private int dailyWage;
	private int fullTimeWork;
	static int Wage_Per_Hour = 20;
	
	public EmpWageComputation(int fullTimePresent, int fullTimeWork) {
		this.fullTimePresent = fullTimePresent;
		this.fullTimeWork = fullTimeWork;
	}

	public void empCheck() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;

		if (empCheck == fullTimePresent) {
			dailyWage = fullTimeWork * Wage_Per_Hour;
			System.out.println("Employee is present and Daily wage is :" +dailyWage);
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {

		EmpWageComputation emp1 = new EmpWageComputation(1,8);
		emp1.empCheck();
	}
}
