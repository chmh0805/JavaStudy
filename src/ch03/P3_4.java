package ch03;

import java.util.Scanner;

public class P3_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num_list = new int[3];
		
		System.out.println("정수 3개 입력>>");
		for (int i=0; i<3; i++) {
			num_list[i] = sc.nextInt();
		}
		
		if (num_list[0] > num_list[1]) {
			if (num_list[1] > num_list[2]) {
				System.out.println("중간 값은 "+num_list[1]);
			} else if (num_list[0] > num_list[2]) {
				System.out.println("중간 값은 "+num_list[2]);
			} else {
				System.out.println("중간 값은 "+num_list[0]);
			}
		} else if (num_list[0] < num_list[1]) {
			if (num_list[1] < num_list[2]) {
				System.out.println("중간 값은 "+num_list[1]);
			} else if (num_list[0] > num_list[2]) {
				System.out.println("중간 값은 "+num_list[0]);
			} else {
				System.out.println("중간 값은 "+num_list[2]);
			}
		}
		
		sc.close();

	}

}
