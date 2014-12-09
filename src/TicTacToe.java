//Justin Himmighoefer
//A tic tac toe game is played.
//The user will be prompted to enter the size of the game board.
//User 1 will enter thier X value in row, column form then user 2 will enter
//the O value in the same manner.
//Game is won when a user gets 3 X's or O's in a row.

import java.util.Scanner;

public class TicTacToe
{
//create variables and give initial values 
private char player;

//constructor
 public TicTacToe()
 {
  player = 'x';
 }

 //method to create a 2 dim array of size or blanks
 public char[][] createArray(int size)
 {
 char[][] ttt = new char[size][size];
 for(int r = 0; r <size; ++r)
        {
         for(int c = 0; c < size; ++c)
         ttt[r][c] = ' ';
        }
 return ttt;
 }

//method to print board
 public void printBoard(char[][] ttt, int size)
 {
 for(int r = 0; r < size; ++r)
        {
        for(int c = 0; c < size; ++c)
        {
        System.out.print(ttt[r][c]);
        System.out.print(" | ");
        }
        System.out.println();
        System.out.println("-----------");
        }//end outer for loop
 }

 //get user input
 public void getUserInput(char[][] ttt, int size)
 {
 Scanner keyboard = new Scanner(System.in);
 System.out.println("Please enter a row: ");
 int row = keyboard.nextInt();
 row = row -1;
 while((row > size - 1) || (row < 0))
       {
        System.out.println("Please enter a row: ");
        row = keyboard.nextInt();
        row = row - 1;
       }
 System.out.println("Please enter a column: ");
 int column = keyboard.nextInt();
 column = column -1;
 while((column > size - 1) || (column < 0))
       {
        System.out.println("Please enter a column: ");
        column = keyboard.nextInt();
        column = column - 1;
       }
 //determine is space is available
 while(ttt[row][column] != ' ')
        {
        System.out.println("Please enter a row: ");
        row = keyboard.nextInt();
        row = row - 1;
 while((row > size -1) || (row < 0))
        {
        System.out.println("Please enter a row: ");
        row = keyboard.nextInt();
        row = row - 1;
        }
        System.out.println("Please enter a column: ");
        column = keyboard.nextInt();
        column = column - 1;
        while((column > size -1) || (column < 0))
        {
        System.out.println("Please enter a column: ");
        column = keyboard.nextInt();
        column = column - 1;
        }
        }//end while loop
    ttt[row][column] = player;
    }//end method getUserInput

 //method to test if won game
 //This method will perform 8 tests of the matrix
 //vertical, horizontal and diagonal
 //first checking if the first space is
 //occupied. Program will end it will (after message)
 
 public void testForWinnerTicTacToe(char[][] ttt)
 {
 //test column 1
 if(((ttt[0][0] != ' ') &&
 (ttt[0][0] == ttt[1][0])) &&
 (ttt[1][0] == ttt[2][0]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }
 //test column 2
 if(((ttt[0][1] != ' ') &&
 (ttt[0][1] == ttt[1][1])) &&
 (ttt[1][1] == ttt[2][1]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }

 //test column 3
 if(((ttt[0][2] != ' ') &&
 (ttt[0][2] == ttt[1][2])) &&
 (ttt[1][2] == ttt[2][2]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }

 //test row 1
 if(((ttt[0][0] != ' ') &&
 (ttt[0][0] == ttt[0][1])) &&
 (ttt[0][1] == ttt[0][2]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }
 //test row 2
 if(((ttt[1][0] != ' ') &&
 (ttt[1][0] == ttt[1][1])) &&
 (ttt[1][1] == ttt[1][2]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }
 //test row 3
 if(((ttt[2][0] != ' ') &&
 (ttt[2][0] == ttt[2][1])) &&
 (ttt[2][1] == ttt[2][2]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }

 //test diagonal 1 left to right downward
 if(((ttt[0][0] != ' ') &&
 (ttt[0][0] == ttt[1][1])) &&
 (ttt[1][1] == ttt[2][2]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }

 //test diagonal 2 right to left downward
 if(((ttt[0][2] != ' ') &&
 (ttt[0][2] == ttt[1][1])) &&
 (ttt[1][1] == ttt[2][0]))
        {
         System.out.println("YOU WIN " + player);
         System.exit(0);
        }
  //switch player
  if(player == 'x')
        player = 'o';
        else
        player = 'x';
 }//end testForWinnerTicTacToe
}//end class
