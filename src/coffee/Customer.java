package coffee;

// 고객
// 책임 : 메뉴 주문, 먹기
public class Customer {
	
	public void order(Barista b) {
		// 바리스타에게 메시지를 보냄
		Coffee c = b.makeCoffee();
		System.out.println(c.getName()+"가 나왔습니다.");
	}
}
