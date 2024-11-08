import java.util.Scanner;
import java.util.Arrays;

/**
 * This is the main board
 * @author Mihir Vishindas
 * @Version 11/7/2024
 */

public class Board {

    // I'm doing a generic approach in case I want to make an n-dimensional tic-tac-toe
    final static int dim = 3;
    private String[][] board;

    // Remaking the game
    public Board() {
        board = new String[dim][dim];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = " ";
            }
        }
    }

    //public String checkBoard()



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String playAgain;
        // Repetitive construct to allow multiple plays
        do {
            // Set the board
            Board board = new Board();
            System.out.println(Arrays.toString(board))




            // Determine whether to play again or not
            System.out.println("Do you want to play again?");
            playAgain = scan.nextLine();

        } while (playAgain.equalsIgnoreCase("yes"));

    }

}