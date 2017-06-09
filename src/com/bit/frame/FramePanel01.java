package com.bit.frame;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class FramePanel01 extends JFrame {

	JPanel jp = new JPanel();
	JButton bt = new JButton(" 확인 ");
	JLabel message = new JLabel("message: ");
	JLabel name = new JLabel(" ID ");
	JLabel passwd = new JLabel(" PASSWD ");
	JTextField nametxt = new JTextField(10);
	JPasswordField secret = new JPasswordField(10);
//	JTextField passwdtxt = new JTextField(10);  <-----비밀번호 그냥 대신 감추기 위해 위에꺼 씀

	public FramePanel01() {

		setTitle("로 그 인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		

		name.setHorizontalAlignment(JLabel.RIGHT);
		passwd.setHorizontalAlignment(JLabel.RIGHT);

		jp.add(name);
		jp.add(nametxt);
		jp.add(passwd);
		jp.add(secret);
		

		JPasswordField pf = new JPasswordField();

		add(jp, "West");
		add(bt, "East");

		add(message, "South");

//		bt.addActionListener(new Btclick());

		Font font = new Font("Gulim", Font.ITALIC, 15);
		Font font2 = new Font("Times", Font.BOLD, 30);

		message.setFont(font);
		name.setFont(font2);
		passwd.setFont(font2);

		setSize(300, 300);
		// setResizable(false);// 크기 변경 ㄴㄴ
		setLocationRelativeTo(null); // 중앙에 창 띄워라

		// pack();
		setVisible(true);

	}
/*	class Btclick implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String msg = "아이디 :" + nametxt.getText();
			// String += "비밀번호 : "+ passwdtxt.get
		}
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FramePanel01();
	}

}
