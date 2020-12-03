package ch07;

import lombok.Data;

@Data
class ResponseDto<T> {
	private int statusCode; // 200이 들어오면 정상, 300이 들어오면 다시요청, 400이 들어오면 오류
	private T data;
}

public class Generic01 {
	public static void main(String[] args) {
		ResponseDto<Integer> dto = new ResponseDto();
		dto.setStatusCode(200); // 정상
		dto.setData(1);
		
		if (dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
			System.out.println();
		}
	}
}
