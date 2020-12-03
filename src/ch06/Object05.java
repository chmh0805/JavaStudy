package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor // Full 생성자를 만들어준다.
@NoArgsConstructor // 디폴트 생성자를 만들어준다.
@Data // Getter, Setter, toString을 만들어준다.
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
