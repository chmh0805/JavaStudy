package coffee;

import lombok.AllArgsConstructor;
import lombok.Data;

// Ŀ��
// å�� : ����
@AllArgsConstructor
@Data
public class Coffee {
	private String name;
	
	public Coffee() {
		name = "�Ƹ޸�ī��";
	}
}
