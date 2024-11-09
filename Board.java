import java.util.Scanner;

/**
 * This is the main board
 * @author Mihir Vishindas
 * @Version 11/7/2024
 */

public class Board {

    // I'm doing a generic approach in case I want to make an n-dimensional tic-tac-toe
    final static int dim = 3;
    private int[][] board;

    // Remaking the game
    public Board() {
        board = new int[dim][dim];
        for (int[] row : board) {
            for (int i = 0; i < row.length; i++) {
                row[i] = 0;
            }
        }
    }

    public void display() {
        String boardString = "";
        for (int[] row : board) {
            for (int index : row) {
                switch (index) {
                    case 0:
                        boardString += "_";
                        break;
                    case 1:
                        boardString += "X";
                        break;
                    case 2:
                        boardString += "O";
                        break;
                    default:
                        System.out.println("ERROR");
                        return;
                }
            }
            boardString += '\n';
        }
        System.out.println(boardString);
    }

    // Printing the board

    //public String checkBoard()



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String playAgain;

        // Set the board
        Board board = new Board();
        board.display();

        // // Repetitive construct to allow multiple plays
        // do {
            




        //     // Determine whether to play again or not
        //     System.out.println("Do you want to play again?");
        //     playAgain = scan.nextLine();

        // } while (playAgain.equalsIgnoreCase("yes"));

    }

}