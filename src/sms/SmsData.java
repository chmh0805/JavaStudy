package sms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SmsData {
	private int id; // ��ȣ 1, 2, 3, ...
	private String text; // ���� ����
	private String to; // ������
	private int errorCode; // �����ڵ�
	private String sendTime; // �߼۽ð�
}