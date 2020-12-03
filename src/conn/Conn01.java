package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class Conn01 {
	public static void main(String[] args) {
		try {
			// 1. 二쇱냼 �꽕�젙 URL �겢�옒�뒪 �궗�슜
			URL url = new URL("https://www.naver.com");
			
			// 2. 踰꾪띁�뿰寃곗쓣 �쐞�빐 �뒪�듃由쇱뿉 �젒洹�
			HttpsURLConnection conn =
					(HttpsURLConnection)url.openConnection();
			
			// 3. 踰꾪띁�뿰寃�
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input = null;
			String download = "";
			while ((input = br.readLine()) != null) {
				download = download + input;
			}
			
			FileWriter fw = new FileWriter("c:\\temp\\index.html");
			fw.write(download);
			fw.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
