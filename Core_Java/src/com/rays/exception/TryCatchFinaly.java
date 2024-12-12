
package com.rays.exception;

public class TryCatchFinaly {

	public static void main(String[] args) {
		int i=10;
		try {

		int c=i/0;

			System.out.println(c);

		} catch (ArithmeticException e) {

			System.out.println(e);

			// System.exit(0);// Program terminates here

		} finally {

			System.out.println("This is Finally Block");
			// System.exit(0); // Program terminates here
		}
		// System.out.println("This will not be executed");

	}

}
