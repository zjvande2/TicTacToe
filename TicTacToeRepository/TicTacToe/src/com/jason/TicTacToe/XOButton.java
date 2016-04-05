package com.jason.TicTacToe;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class XOButton extends JButton implements ActionListener 
{
	String buttonNum;
	ImageIcon X, O;
	byte value = startingTurn();
	TurnManager gm = new TurnManager();
	
	public byte startingTurn()
	{
		return ((byte)((Math.random() * 2) + 1));
	}
	public XOButton(int x) 
	
	{
		this.buttonNum = ("Grid " + x);
	//	System.out.println(this.getClass());
		
		X = new ImageIcon(this.getClass().getResource("X.png"));
		
		O = new ImageIcon(this.getClass().getResource("O.png"));
		
		//value = turn.player((byte) 2);
		
		this.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) 
	{
		value = gm.turn;
		switch (value) 
		{
			case 0:
				//value = turn.player((byte) 1);
				System.out.println(this.buttonNum + " ----> empty \n");
				TurnManager.nextTurn();
				setIcon(null);
				break;
			case 1:
				//value = turn.player((byte) 2);
				System.out.println(this.buttonNum + " ----> X \n");
				TurnManager.nextTurn();
				setIcon(X);
				break;
			case 2:
				System.out.println(this.buttonNum + " ----> O \n");
				TurnManager.nextTurn();
				setIcon(O);
				break;
		}
	}
}
	/*
	public byte nextTurn()
	{
		if (value == 0)
		{
			value = 1;
		} else if (value == 1)
		{
			value = 2;
		} 
		else if (value == 2)
		{
			value = 1;
		} 
		else 
		{
			value = 0;
		}
		return value;
		
		
	}
}

*/