package com.bit.frame;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FramePanel extends JFrame {

	JPanel jp=new JPanel();
	JButton jb = new JButton(" 확인 ");
		
		
	public FramePanel() {

		setTitle(" FRAME PANEL ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널에 gridlayout 을 적용
		jp.setLayout(new GridLayout(2,2));
		
		
		// 레이블 생성
		JLabel jl= new JLabel(" NAME ");
		jl.setHorizontalAlignment(JLabel.RIGHT);
		//레이블을 패널에 추가
		jp.add(jl);
		
		//id textbox생성
		JTextField txtid = new JTextField(10);
		// 패널에 추가
		jp.add(txtid);
		
		
		JLabel jl2= new JLabel(" PASSWORD ");
		jl2.setHorizontalAlignment(JLabel.RIGHT);
		jp.add(jl2);
		
		// pw textbox생성
		JTextField txtpw= new JTextField(10);
		jp.add(txtpw);
		
		add(jp,"West");
		add(jb,"East");
		
		
		
		
		setSize(300,300);
		pack();
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new FramePanel();

	}

}
