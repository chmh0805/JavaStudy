package coffeeshop;

public class Customer {
	public void order(String menuName, MenuBoard menuBoard, Barista barista) {
		MenuItem menuItem = menuBoard.choose(menuName);
		Coffee coffee = barista.makeCoffee(menuItem);
	}
}
