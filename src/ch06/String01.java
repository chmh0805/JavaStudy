package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// DTO = Data Transfer Object = ��ſ��� ���� ����.
class UserDto {
	private int id;
	private String name;
}

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:ȫ�浿";
		UserDto dto = new UserDto();
		
		// �Ľ� parsing(���� �м�)
		// id:1�� name:ȫ�浿���� ������
		String[] dataList = data.split(",");
		
		// id�� 1�� ������
		String[] dataIdList = dataList[0].split(":");
		// 1���� String�̱� ������ int������ �����Ͽ� ����
		int dataId = Integer.parseInt(dataIdList[1]);
		
		// name�� ȫ�浿���� ������
		String[] dataNameList = dataList[1].split(":");
		// ȫ�浿 �� ����
		String dataName = dataNameList[1];
		
		// dto�� id���� name���� �־��ش�.
		dto.setId(dataId);
		dto.setName(dataName);
		
		System.out.println(dto);
	}
}
