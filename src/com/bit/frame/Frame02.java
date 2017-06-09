package com.bit.frame;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame02 {

	JFrame jf = new JFrame();

	public Frame02() {

		
		
		jf.setTitle(" Login ");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridLayout(2,2));
		
		
		JLabel jl = new JLabel("< ID >");
		jl.setHorizontalAlignment(JLabel.RIGHT);//오른쪽 정렬
		JTextField txtid= new JTextField (10); 
		
		JLabel jl2 = new JLabel("< Password >");
		jl.setHorizontalAlignment(JLabel.RIGHT);
		JTextField txtpw= new JTextField (10);
			
		jf.add(jl);
		jf.add(txtid);
		jf.add(jl2);
		jf.add(txtpw);
		
		jf.setSize(300,300);
//		jf.pack();
		jf.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame02();
	}

}
