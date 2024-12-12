package com.rays.inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\ADMIN\\Desktop\\IO\\MainBefore.jpg";
		String target = "C:\\Users\\ADMIN\\Desktop\\IO\\mahiiii.txt";
 
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i;
		while ((i = in.read()) != -1) {

			out.write(i);

		}

		System.out.println("success");
	}

}