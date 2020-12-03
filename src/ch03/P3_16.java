package ch03;

import java.util.Scanner;

class Rsp {
	String rsp_list[] = {"가위", "바위", "보"};
	
}

public class P3_16 {

	public static void main(String[] args) {
		Rsp rsp = new Rsp();
		Scanner sc = new Scanner(System.in);
		String user_rsp = "1";
		
		while (true) {
			System.out.println();
			System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
			System.out.println("가위 바위 보!>>");
			user_rsp = sc.next();
			
			if (user_rsp.equals("그만")) {
				System.out.println("게임을 종료합니다...");
				sc.close();
				break;
			} else if (user_rsp.equals("가위") || user_rsp.equals("바위") || user_rsp.equals("보")) {
				int n = (int)(Math.random()*3);
				String cm_rsp = rsp.rsp_list[n];
				if(cm_rsp.equals("바위")) {
					if (user_rsp.equals("보")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 이겼습니다.");
					} else if (user_rsp.equals("가위")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 졌습니다.");
					} else {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 비겼습니다.");
					}
				} else if (cm_rsp.equals("가위")) {
					if (user_rsp.equals("바위")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 이겼습니다.");
					} else if (user_rsp.equals("보")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 졌습니다.");
					} else {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 비겼습니다.");
					}
				} else if (cm_rsp.equals("보")) {
					if (user_rsp.equals("가위")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 이겼습니다.");
					} else if (user_rsp.equals("바위")) {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 사용자가 졌습니다.");
					} else {
						System.out.println("사용자 = "+user_rsp+" , 컴퓨터 = "+cm_rsp+", 비겼습니다.");
					}
				}
			} else {
				System.out.println("가위, 바위, 보, 그만 중 입력하세요.");
			}
			

		}

	}

}
