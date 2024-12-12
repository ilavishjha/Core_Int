package com.rays.inputoutput;

import java.io.*;

public class EmailReadWrite { 
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\IO\\WrongEmail.txt"));
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\ADMIN\\Desktop\\IO\\EmailsCorrectWrite.txt"));

		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

		String line = in.readLine();
		while (line != null) {
			if (line.matches(emailreg)) {
				out.println(line);
			}
			line = in.readLine();
		}
		out.close();
		in.close();
	}
}