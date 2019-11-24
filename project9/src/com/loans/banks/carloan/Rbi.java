package com.loans.banks.carloan;

public interface Rbi {
	public void withdraw();
	public void deposit();
	
public static void main(String[] args) {
	Rbi i2 = new Hdfc();
	i2.deposit();
	i2.withdraw();
}

}
