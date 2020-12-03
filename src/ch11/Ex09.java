package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex09 extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea  ta = new JTextArea(7, 20);
	
	public Ex09() {
		setTitle("�ؽ�Ʈ���� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("�Է� �� <Enter>Ű�� �Է��ϼ���"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				
				t.setText("");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
