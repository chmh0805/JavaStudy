package coffeeshop;

import java.util.List;

public class MenuBoard {
	private List<MenuItem> items;
	
	public MenuBoard(List<MenuItem> items) {
		this.items = items;
	}
	
	public MenuItem choose(String menuName) {
		for (MenuItem each : items) {
			if (each.getName().equals(menuName)) {
				return each;
			}
		}
		return null;
	}
}
