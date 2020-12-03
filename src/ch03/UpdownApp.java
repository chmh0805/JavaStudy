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
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		while (true) {
			printRange(minNum, maxNum, count);
			userPick = sc.nextInt();
			
			if (userPick > answer) {
				System.out.println("더 낮게");
				maxNum = userPick;
				count += 1;
			} else if (userPick < answer) {
				System.out.println("더 높게");
				minNum = userPick;
				count += 1;
			} else if (userPick == answer) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n)>>");
				userInput = sc.next();
			}
				
			if (userInput.equals("y")) {
				answer = (int)(Math.random()*100);
				minNum = 1;
				maxNum = 99;
				count = 1;
				userInput = "c";
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				continue;
			} else if (userInput.equals("n")) {
				sc.close();
				break;
			}
		}

	}

}
