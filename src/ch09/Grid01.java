package ch09;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Grid01 extends JFrame {

	public Grid01() {
		setTitle("GridLayout Sample");
		// X버튼 클릭하면 main이 종료됨.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 4x2 격자의 GridLayout 배치관리자 생성
		GridLayout grid = new GridLayout(4, 2);
		grid.setVgap(5); // 격자 사이의 수직 간격을 5 픽셀로 설정
		
		Container c = getContentPane();
		JPanel jp1 = new JPanel();
		jp1.setLayout(grid); // grid를 컨텐트팬의 배치관리자로 지정
		JPanel jp2 = new JPanel();
		c.add(jp1, BorderLayout.CENTER);
		c.add(jp2, BorderLayout.SOUTH);
		jp2.setLayout(new BorderLayout());
		
		jp1.add(new JLabel(" 이름"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학번"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 학과"));
		jp1.add(new JTextField(""));
		jp1.add(new JLabel(" 과목"));
		jp1.add(new JTextField(""));
		jp2.add(new JButton("입력"));
		
		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Grid01();
	}

}
