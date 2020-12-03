package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Ex12 extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango", "pear",
						"peach", "berry", "strawberry", "blackberry"};
	private String[] names = {"kitae", "jaemoon", "hyosoo", "namyun"};
	
	public Ex12() {
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> fruitBox = new JComboBox<>(fruits);
		
		JComboBox<String> nameBox = new JComboBox<>();
		
		for (int i = 0; i < names.length; i++) {
			nameBox.addItem(names[i]);
		}
		
		c.add(fruitBox);
		c.add(nameBox);

		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex12();
	}
}
