package com.jason.TicTacToe;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener {
	ImageIcon X, O;
	public static byte value = 0;
	int id;
	/*
	 * 0:nothing 1:X 2:O
	 */

	public XOButton(int i) {
		this.id = i;
		X = new ImageIcon(this.getClass().getResource("X.png"));
		O = new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		switch (value) {
		case 0:
			
			//This should never be initiated, if this is set, there is an error
			setIcon(null);
			GameMaster.swtichTurn(value);
			System.out.println(value);
			break;
		case 1:
			setIcon(X);
			GameMaster.swtichTurn(value);
			System.out.println(value);
			break;
		case 2:
			setIcon(O);
			GameMaster.swtichTurn(value);
			System.out.println(value);
			break;
		}
	}
}