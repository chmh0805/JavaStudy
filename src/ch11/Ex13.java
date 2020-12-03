package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex13 extends JFrame {
	private String[] fruits = {"apple", "banana", "kiwi", "mango"};
	private ImageIcon[] images = {
			new ImageIcon("images/apple.jpg"),
			new ImageIcon("images/banana.jpg"),
			new ImageIcon("images/kiwi.jpg"),
			new ImageIcon("images/mango.jpg")
	};
	
	public Ex13() {
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox<String> fruitBox = new JComboBox<>(fruits);
		c.add(fruitBox);
		
		JLabel laImage = new JLabel();
		c.add(laImage);
		
		fruitBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				
				laImage.setIcon(images[index]);
			}
		});
		
		setSize(300, 250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex13();
	}
}
