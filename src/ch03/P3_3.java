package ch03;

import java.util.Scanner;

public class P3_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		final int oMoney = sc.nextInt();
		int money = oMoney;

		int arr[] = {50000, 10000, 1000, 100, 50, 10, 1};

		for (int i = 0; i < arr.length; i++) {
			if (money / arr[i] != 0) {
				System.out.println(arr[i]+"���� "+(money/arr[i]));
				money %= arr[i];
			}
		}

		sc.close();

	}

}
