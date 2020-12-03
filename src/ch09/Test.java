package ch09;

public class Test {
	public static void main(String[] args) {
		System.out.println(MyLayout.WEST.getValue());
		System.out.println(MyLayout.EAST.getValue());
		System.out.println(MyLayout.NORTH.getValue());
		System.out.println(MyLayout.SOUTH.getValue());
		System.out.println(MyLayout.CENTER.getValue());
		
		int code = 400;
		
		if (code == HTMLCode.SUCCESS.getCode()) {
			System.out.println(HTMLCode.SUCCESS.getMsg());
		} else if (code == HTMLCode.FAIL.getCode()) {
			System.out.println(HTMLCode.FAIL.getMsg());
		}
	}
}
