
package com.rays.exception;

public class BankTest {

	public static void main(String[] args) {
	
			BankAccount a = new BankAccount();
			a.setBalance(2000);
			a.deposite(100);
			System.out.println(a.getBalance());
		try {
			a.withdraw(3000);
			//System.out.println(a.getBalance());
		} catch (BankException e) {
			//System.out.println("Amount is less than 2000");
			//System.out.println(e.getMessage());
			//System.out.println(e);
			e.printStackTrace();
			System.out.println(a.getBalance());
		}
	}

}
