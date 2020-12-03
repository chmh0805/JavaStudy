package ch03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MyScanner {

	public String getData() {
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in); // 아스키코드 -> 문자(but 한글자만 가능)
		BufferedReader br = new BufferedReader(ir);
		
		try {
			return br.readLine();
		} catch (IOException e) {
			System.out.println("괜찮아!!");
		}
		return "";
	}

}
