package conn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMath {
	private String calculate(String inputMessage) {
		int num1 = Integer.parseInt(inputMessage.split(" ")[0]);
		String oper = inputMessage.split(" ")[1];
		int num2 = Integer.parseInt(inputMessage.split(" ")[2]);
		String answer = "";
		if (oper.equals("+")) {
			answer = Integer.toString(num1 + num2);
		} else if (oper.equals("-")) {
			answer = Integer.toString(num1 - num2);
		} else if (oper.equals("*")) {
			answer = Integer.toString(num1 * num2);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		
		try {
			listener = new ServerSocket(10000);
			System.out.println("연결을 기다리고 있습니다.....");
			socket = listener.accept();
			System.out.println("계산기 연결 완료");
			while (true) {
				String inputMessage = in.readLine();
				if (inputMessage.equalsIgnoreCase("bye")) {
					System.out.println("클라이언트에서 bye로 연결을 종료하였음");
					break;
				}
				System.out.println("클라이언트 : " + inputMessage);
				String outputMessage = new ServerMath().calculate(inputMessage);
				out.write(outputMessage);
				out.flush();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				listener.close();
			} catch (Exception e) {
				System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
