package com.loans.banks.carloan;

public class Icici implements Rbi {

	public static void main(String[] args) {
		Icici i =new Icici();
		i.withdraw();
		i.withdraw();

	}

	public void withdraw() {
		System.out.println("ICICI bank over-ridden withdraw method");
		
	}

	public void deposit() {
		System.out.println("ICICI bank over-ridden deposit method ");
		
	}

}
