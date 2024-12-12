package com.rays.inputoutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBinaryFileWithBuffer {
	public static void main(String[] args) throws IOException {

		String source = "C:\\\\Users\\\\ADMIN\\\\Desktop\\\\IO\\\\MainBefore.jpg";

		String target = "C:\\\\Users\\\\ADMIN\\\\Desktop\\\\IO\\\\MainBefore.txt";

		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(source));

		BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(target));

		int i;

		while ((i= bi.read()) != -1) {

			bo.write(i);


		}
		System.out.println("sucessfully");
		bo.close();

	}

}