package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
// DTO = Data Transfer Object = 통신에서 많이 사용됨.
class UserDto {
	private int id;
	private String name;
}

public class String01 {
	public static void main(String[] args) {
		String data = "id:1,name:홍길동";
		UserDto dto = new UserDto();
		
		// 파싱 parsing(구문 분석)
		// id:1과 name:홍길동으로 나누기
		String[] dataList = data.split(",");
		
		// id와 1로 나누기
		String[] dataIdList = dataList[0].split(":");
		// 1값은 String이기 때문에 int값으로 변경하여 받음
		int dataId = Integer.parseInt(dataIdList[1]);
		
		// name과 홍길동으로 나누기
		String[] dataNameList = dataList[1].split(":");
		// 홍길동 값 받음
		String dataName = dataNameList[1];
		
		// dto에 id값과 name값을 넣어준다.
		dto.setId(dataId);
		dto.setName(dataName);
		
		System.out.println(dto);
	}
}
