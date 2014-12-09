//Justin Himmighoefer

import java.util.Scanner;

public class TTTTester
{
	public static void main(String[] args)
	{
		int size;
		Scanner keyboard = new Scanner(System.in);
		
		//size of game
		System.out.println("Please enter the size of game to be played: ");
		size = keyboard.nextInt();
		
		TicTacToe myGame = new TicTacToe();
		char[][] myBoard = myGame.createArray(size);
		for(int i = 0; i < (size*size); ++i)
		{
			myGame.printBoard(myBoard, size);
			myGame.getUserInput(myBoard, size);
			myGame.testForWinnerTicTacToe(myBoard);
		}
		System.out.println("TIE GAME x");
	}//end main
}//end class
