package ch04;

public class CatApp {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.setName("고양이1");
		c.setAge(1);
		c.setColor("하얀색");
		
		System.out.println(c.getName());
		System.out.println(c.getColor());
		System.out.println(c.getAge());
	}

}
