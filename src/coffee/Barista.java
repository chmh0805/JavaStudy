package coffee;

// 바리스타
// 책임 : 커피제조
public class Barista {
	
	// 바리스타의 책임
	public Coffee makeCoffee() {
		System.out.println("커피 나왔습니다.");
		return new Coffee();
	}
}
