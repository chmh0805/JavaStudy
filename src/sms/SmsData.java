package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SmsData {
	private int id; // 번호 1, 2, 3, ...
	private String text; // 문자 내용
	private String to; // 수신자
	private int errorCode; // 오류코드
	private String sendTime; // 발송시간
}