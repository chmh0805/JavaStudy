package ch03;

import java.util.Scanner;

class Rsp {
	String rsp_list[] = {"����", "����", "��"};
	
}

public class P3_16 {

	public static void main(String[] args) {
		Rsp rsp = new Rsp();
		Scanner sc = new Scanner(System.in);
		String user_rsp = "1";
		
		while (true) {
			System.out.println();
			System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
			System.out.println("���� ���� ��!>>");
			user_rsp = sc.next();
			
			if (user_rsp.equals("�׸�")) {
				System.out.println("������ �����մϴ�...");
				sc.close();
				break;
			} else if (user_rsp.equals("����") || user_rsp.equals("����") || user_rsp.equals("��")) {
				int n = (int)(Math.random()*3);
				String cm_rsp = rsp.rsp_list[n];
				if(cm_rsp.equals("����")) {
					if (user_rsp.equals("��")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �̰���ϴ�.");
					} else if (user_rsp.equals("����")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �����ϴ�.");
					} else {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", �����ϴ�.");
					}
				} else if (cm_rsp.equals("����")) {
					if (user_rsp.equals("����")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �̰���ϴ�.");
					} else if (user_rsp.equals("��")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �����ϴ�.");
					} else {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", �����ϴ�.");
					}
				} else if (cm_rsp.equals("��")) {
					if (user_rsp.equals("����")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �̰���ϴ�.");
					} else if (user_rsp.equals("����")) {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", ����ڰ� �����ϴ�.");
					} else {
						System.out.println("����� = "+user_rsp+" , ��ǻ�� = "+cm_rsp+", �����ϴ�.");
					}
				}
			} else {
				System.out.println("����, ����, ��, �׸� �� �Է��ϼ���.");
			}
			

		}

	}

}
