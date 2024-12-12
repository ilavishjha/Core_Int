package com.rays.inputoutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SplitFileTest {

	public static void main(String[] args) throws IOException {

		// 1. To count no of line of file
		String s = "C:\\Users\\ADMIN\\Desktop\\IO\\SplitFile.txt";
		int count = 0;
		int nol = 5;
		File file = new File(s);

		Scanner sc = new Scanner(file);

		while (sc.hasNext()) {
			sc.nextLine();
			count++;

		}

		System.out.println("No of line  " + count);

		// 2. To create no of file
		int temp = count / nol;
		int rem = count % nol;
		int nof = temp;

		if (rem != 0) {
			nof++;
		}
		System.out.println("No of files... " + nof);

		// 3. here we read file data
		BufferedReader br = new BufferedReader(new FileReader(s));

		String str;

		// 4. here we create files nof
		for (int i = 1; i <= nof; i++) {

			BufferedWriter bw = new BufferedWriter(
					new FileWriter("C:\\Users\\ADMIN\\Desktop\\IO\\OkSplitFile" + i + ".txt"));

			// 5. here we write nol in files
			for (int j = 1; j <= nol; j++) {
				str = br.readLine();

				if (str != null) {

					bw.write(str);

					// str = br.readLine();

					if (j != nol) {
						bw.newLine();

					}
				}
			}
			bw.close();

		}
		br.close();
	}

}