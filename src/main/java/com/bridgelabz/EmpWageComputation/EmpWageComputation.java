package com.bridgelabz.EmpWageComputation;

public class EmpWageComputation {
	private int fullTime;

	public EmpWageComputation(int fullTime) {
		this.fullTime = fullTime;
	}

	public void empCheck() {

		int empCheck = (int) Math.floor(Math.random() * 10) % 2;

		if (empCheck == fullTime) {
			System.out.println("Employee is present");
		} else {
			System.out.println("Employee is absent");
		}
	}

	public static void main(String[] args) {

		EmpWageComputation emp1 = new EmpWageComputation(1);
		EmpWageComputation emp2 = new EmpWageComputation(0);
		emp1.empCheck();
		emp2.empCheck();
	}
}
