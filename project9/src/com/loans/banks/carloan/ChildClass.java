package com.loans.banks.carloan;

public class ChildClass extends FirstAbstract{

	public static void main(String[] args) {
		ChildClass c1 =new ChildClass();
		c1.m2();
		c1.m1();

	}
	
	public void m1() {
		System.out.println("m1 method overridden in Child class");
	}

	@Override
	public void m2() {
		System.out.println("m2 method of Child class");
		
	}

}
