package ch04;

public class PersonApp2 {

	public static void main(String[] args) {
		// 기본생성자 : 클래스명() -> 생략가능
		// 생성자가 없으면 컴파일러가 default값을 만들어준다!!
		Person p1 = new Person("최승희", "의사", 45, '여', "A");
		p1.preview();
		
		Person p2 = new Person("이미녀", "골프 선수", 28, '여', "O");
		p2.preview();
		
		Person p3 = new Person("김미남", "교수", 47, '남', "AB");
		p3.preview();
		
		
	}

}
