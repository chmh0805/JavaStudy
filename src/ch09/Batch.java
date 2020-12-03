package ch09;

// 실수 방지 !!!
// 변수 : public static final이 생략되어 있음.
// 자바에서 final변수(상수)는 대문자로 만든다. (약속 !)
public interface Batch {
	String EAST = "East";
	String WEST = "West";
	String NORTH = "North";
	String SOUTH = "South";
	String CENTER = "Center";
}
