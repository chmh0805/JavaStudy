package ch08;

import java.io.FileWriter;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileWriter fout = null;
		try {
			fout = new FileWriter("c:\\Temp\\test.txt");
			
			while (true) {
				String line = scanner.nextLine();
				if (line.length() == 0) {
					break;
				}
				fout.write(line);
				fout.write("\r\n");
			}
			fout.close();
		} catch (Exception e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}
