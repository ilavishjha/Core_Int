package com.rays.inputoutput;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExitFileWriteLineByLine {

	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\ADMIN\\Desktop\\IO\\Lavish.txt"));

		out.println("hello bhai ");

		out.println("kkrh??");

		out.close();

		System.out.println("data write successfully...!!!");

	}

}