package com.bit.frame;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame01 {

	JFrame jf = new JFrame();
	
	
	public Frame01() {

		jf.setTitle("Swing Project");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new FlowLayout());
		
		
		JLabel jl= new JLabel(" ID ");
		jf.add(jl);
		
		JTextField tf = new JTextField(10);
		jf.add(tf);
		
		
		JButton jb = new JButton("확인");
		jf.add(jb);
		
		
		jf.setSize(100, 100);
		jf.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Frame01();
	}

}
