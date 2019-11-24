package com.loans.banks.carloan;

public class Hdfc implements Rbi {
public static void main(String[] args) {
	Hdfc h =new Hdfc();
	h.withdraw();
	h.deposit();
}

public void withdraw() {
	System.out.println("HDFC bank over ridden withdraw method");
	
}

public void deposit() {
	System.out.println("HDFC bank over ridden deposit method");
	
}
}
