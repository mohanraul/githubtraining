package com.loans.banks.carloan;

public abstract class FirstAbstract {
	
	public void m1() {
		System.out.println("m1 method from FirstAbstract class");
	}
	
	public abstract void m2();
	
	public static void main(String[] args) {
		FirstAbstract f1 = new ChildClass();
		f1.m1();
		f1.m2();
	}

}
