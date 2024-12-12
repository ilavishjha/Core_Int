package com.rays.inputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ADMIN\\Desktop\\IO\\ok1.txt"));
		String line = br.readLine();
		while (line != null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
	}
}
