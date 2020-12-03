package ch03;

import java.util.Scanner;

public class UpdownApp {
	
	static void printRange(int minNum, int maxNum, int count) {
		System.out.println();
		System.out.println(minNum + "-" + maxNum);
		System.out.print(count+">>");
	}

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100);
		int minNum = 0;
		int maxNum = 99;
		int count = 1;
		Scanner sc = new Scanner(System.in);
		int userPick = 110;
		String userInput = "c";
		
		System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
		while (true) {
			printRange(minNum, maxNum, count);
			userPick = sc.nextInt();
			
			if (userPick > answer) {
				System.out.println("�� ����");
				maxNum = userPick;
				count += 1;
			} else if (userPick < answer) {
				System.out.println("�� ����");
				minNum = userPick;
				count += 1;
			} else if (userPick == answer) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n)>>");
				userInput = sc.next();
			}
				
			if (userInput.equals("y")) {
				answer = (int)(Math.random()*100);
				minNum = 1;
				maxNum = 99;
				count = 1;
				userInput = "c";
				System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
				continue;
			} else if (userInput.equals("n")) {
				sc.close();
				break;
			}
		}

	}

}
