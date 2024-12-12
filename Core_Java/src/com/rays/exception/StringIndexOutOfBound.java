
package com.rays.exception;

public class StringIndexOutOfBound {
	public static void main(String[] args) {
		String s = "amit";
		try {
			

				System.out.println(s.charAt(8));
			
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
