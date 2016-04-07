package com.jason.TicTacToe;

public class GameMaster 
{
	private static byte turnNum = 0;
	
	public static void setBility(boolean bil, int id)
	{
		if (bil == false)
		{
			System.out.println("Button " + id + " is not avaliable to be changed"); 
			
		}
	}
	
	public static byte swtichTurn(byte turn)
	{
		if (turn == 0) {
			turnNum = 1;
			return 1;
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
	public byte getTurn()
	{ return turnNum; }
}
