package com.jason.TicTacToe;

public class GameMaster 
{
	private static byte turnNum = 1;
	
	public static boolean checkBility(boolean bil, XOButton xoButton)
	{
		if (xoButton == null)
		{
		
			return false;
		} else {
			return true;
		}
	}
	
	public static byte swtichTurn(byte turn)
	{
		if (turn == 0) {
			turnNum = 1;
			return 2;
		} else if (turn == 1){
			turnNum = 2;
			return 2;
		} else if (turn == 2) {
			turnNum = 1;
			return 1;
		} else {
			turnNum = 1;
			return 1;
		}
	}
	public static byte getTurn()
	{ 
		return turnNum; 
	}
}
