package conn;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Conn04 {
	public static void main(String[] args) {
		try {
			// 1. 雅뚯눘�꺖 占쎄퐬占쎌젟 URL 占쎄깻占쎌삋占쎈뮞 占쎄텢占쎌뒠
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EB%82%A0%EC%94%A8");
			
			// 2. 甕곌쑵�쓠占쎈염野껉퀣�뱽 占쎌맄占쎈퉸 占쎈뮞占쎈뱜�뵳�눘肉� 占쎌젔域뱄옙
			HttpsURLConnection conn =
					(HttpsURLConnection)url.openConnection();
			
			// 3. 甕곌쑵�쓠占쎈염野껓옙
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			
			String input = null;
			String download = "";
			while ((input = br.readLine()) != null) {
				download = download + input;
			}
			
//			int beginIndex = download.indexOf("\"todaytemp\"")+12;
//			int endIndex = download.indexOf("</span><span class=\"tempmark\">");
//			String temp = download.substring(beginIndex, endIndex);
			
			Document doc = Jsoup.parse(download);
			Elements temp = doc.select(".todaytemp");
			System.out.println("오늘의 온도는 : " + temp.get(0).text());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
