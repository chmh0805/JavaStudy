package ch11;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ex10 extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango",
								"pear", "peach", "berry", "strawberry", "blackberry"};
	private ImageIcon[] images = {
							new ImageIcon("images/icon1.png"),
							new ImageIcon("images/icon2.png"),
							new ImageIcon("images/icon3.png"),
							new ImageIcon("images/icon4.png")};
	private Container c = getContentPane();
	private JList<String> fruitList1 = new JList<>(fruits);
	private JList<ImageIcon> imageList = new JList<>(images);
	private JList<String> fruitList2 = new JList<>(fruits);
	
	public Ex10() {
		setTitle("리스트 만들기 예제");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		c.setLayout(new FlowLayout());
		c.add(fruitList1);
		c.add(imageList);
		c.add(new JScrollPane(fruitList2));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex10();
	}
}
