package ch09;

public enum HTMLCode {
	SUCCESS(200, "���� ����"),
	FAIL(400, "���� ����");
	
	private int code;
	private String msg;
	
	private HTMLCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	
	public int getCode() {
		return code;
	}
	
	public String getMsg() {
		return msg;
	}
}
