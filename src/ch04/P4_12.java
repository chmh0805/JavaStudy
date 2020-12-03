package ch04;

import java.util.Scanner;

class Sseat {
	private String[] seats = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};
	
	public void show() {
		System.out.print("S>>");
		for (int i=0; i<this.seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	
	public void reserve(String name, int num) {
		if (num <= 10) {
			if (this.seats[num-1] == "---") {
				this.seats[num-1] = name;
			}
		}
	}
	
	public void cancel(String name) {
		for (int i=0; i<10; i++) {
			if (this.seats[i].equals(name)) {
				this.seats[i] = "---";
			}
		}
	}
}


class Aseat {
	private String[] seats = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};

	public void show() {
		System.out.print("A>>");
		for (int i=0; i<this.seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	
	public void reserve(String name, int num) {
		if (num <= 10) {
			if (this.seats[num-1] == "---") {
				this.seats[num-1] = name;
			}
		}
	}
	
	public void cancel(String name) {
		for (int i=0; i<10; i++) {
			if (this.seats[i].equals(name)) {
				this.seats[i] = "---";
			}
		}
	}
}

class Bseat {
	private String[] seats = {"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"};

	public void show() {
		System.out.print("B>>");
		for (int i=0; i<this.seats.length; i++) {
			System.out.print(seats[i]+" ");
		}
		System.out.println();
	}
	
	public void reserve(String name, int num) {
		if (num <= 10) {
			if (this.seats[num-1] == "---") {
				this.seats[num-1] = name;
			}
		}
	}
	
	public void cancel(String name) {
		for (int i=0; i<10; i++) {
			if (this.seats[i].equals(name)) {
				this.seats[i] = "---";
			}
		}
	}
}

public class P4_12 {

	public static void main(String[] args) {
		Sseat s1 = new Sseat();
		Aseat s2 = new Aseat();
		Bseat s3 = new Bseat();
		Scanner sc = new Scanner(System.in);
		int user_input = 0;
		int user_seat_input = 0;
		
		while (user_input != 4) {
			System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
			System.out.println("����:1, ��ȸ:2, ���:3, ������:4>>");
			user_input = sc.nextInt();
			if (user_input == 4) {
				sc.close();
				break;
			}
			
			if (user_input == 1) {
				System.out.println("�¼����� S(1), A(2), B(3)>>");
				user_seat_input = sc.nextInt();
				if (user_seat_input == 1) {
					s1.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					System.out.println("��ȣ>>");
					int user_seat = sc.nextInt();
					s1.reserve(user_name, user_seat);
				}
				if (user_seat_input == 2) {
					s2.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					System.out.println("��ȣ>>");
					int user_seat = sc.nextInt();
					s2.reserve(user_name, user_seat);
				}
				if (user_seat_input == 3) {
					s3.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					System.out.println("��ȣ>>");
					int user_seat = sc.nextInt();
					s3.reserve(user_name, user_seat);
				}
			}
			
			if (user_input == 2) {
				s1.show();
				s2.show();
				s3.show();
				System.out.println("<<<��ȸ�� �Ϸ��Ͽ����ϴ�.>>>");
			}
			
			if (user_input == 3) {
				System.out.println("�¼� S:1, A:2, B:3>>");
				user_seat_input = sc.nextInt();
				if (user_seat_input == 1) {
					s1.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					s1.cancel(user_name);
				}
				if (user_seat_input == 2) {
					s2.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					s2.cancel(user_name);
				}
				if (user_seat_input == 3) {
					s3.show();
					System.out.println("�̸�>>");
					String user_name = sc.next();
					s3.cancel(user_name);
				}
			}
			
			if (user_input != 1 | user_input != 2 | user_input != 3 | user_input != 4) {
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				continue;
			}
			
		}
	}

}
