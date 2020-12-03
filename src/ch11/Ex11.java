package ch11;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Ex11 extends JFrame {
	private Container c;
	private JLabel la;
	private JTextField tf;
	private Vector<String> v;
	private JList<String> nameList;
	
	private void initObject() {
		c = getContentPane();
		la = new JLabel("이름 입력 후 <Enter>키");
		tf = new JTextField(10);
		v = new Vector<>();
		nameList = new JList<>();
	}
	
	private void initSetting() {
		setTitle("리스트 변경 예제");
		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		nameList.setVisibleRowCount(8);
		nameList.setFixedCellWidth(100);
		nameList.setFont(new Font("CookieRun", Font.ITALIC, 18));
	}
	
	private void initBatch() {
		c.add(la);
		c.add(tf);
		c.add(new JScrollPane(nameList));
	}
	
	public Ex11() {
		initObject();
		
		initSetting();
		
		initBatch();
		
		tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				v.add(t.getText());
				nameList.setListData(v);
				
				t.setText("");
			}
		});
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex11();
	}
}
