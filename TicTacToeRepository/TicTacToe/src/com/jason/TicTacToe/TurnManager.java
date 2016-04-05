package com.jason.TicTacToe;

public class TurnManager 
{
	public static byte turn;
	
	
	public static byte nextTurn()
	{
		{
			if (turn == 1)
			{
				turn = 2;
			} 
			else if (turn == 2)
			{
				turn = 1;
			} else if (turn == 0)
			{
				turn = 1;
			}
			
			else 
			{
					turn = 1;
			}
			return turn;
		}
	}
}
