package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Full �����ڸ� ������ش�.
@NoArgsConstructor // ����Ʈ �����ڸ� ������ش�.
@Data // Getter, Setter, toString�� ������ش�.
class User2 {
	private int id;
	private String username;
}

public class Object05 {
	public static void main(String[] args) {
		User2 user = new User2(1, "ssar");
		System.out.println(user);
	}
}
