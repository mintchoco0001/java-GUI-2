package GUIEvent2;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class jTextArea extends JFrame {
	private JTextField tf = new JTextField(20);
	private JTextArea ta = new JTextArea(7,20);
	public jTextArea() {
		setTitle("jtext");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("입력 후 <Enter>키를 누르세요"));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				ta.append(t.getText() + "\n");
				t.setText("");
			}
		});
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new jTextArea();
	}

}
