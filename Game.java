import java.util.Scanner;

public class Game {

    char[][] board; // Why should i not instantiate the array here itself?
    boolean status; // true stands for game is still in progress. false means its done. 
    public static final String PLAYER_PROMPT = "Make your move Player %d";
    public static final String WIN_PROMPT = "Player %d won the game";
    public static final String ERROR_PROMPT = "Move is Invalid!";

    public Game() {
        board = new char[3][3];
        status = false;
        clearBoard();
    }

    public char[][] getBoard() {
        return board;
    }

    public boolean getStatus() {
        return status;
    }

    private void clearBoard() {
        for (char[] board1 : board) {
            for (int i = 0; i < board1.length; i++) {
                board1[i] = ' ';
            }
        }
    }

    private String boardToString() {
        String boardString = "";
        for (char[] row : board) {
            for (char cell : row) {
                boardString += cell + " ";
            }
            boardString += "\n";
        }
        return boardString;
    }

    public void printBoard() {
        System.out.println(boardToString());
    }

    public boolean checkValid(String response) {
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) { // Game Loop
            System.out.println("Do you wish to play Tic-Tac-Toe?");
            if (scanner.nextLine().equalsIgnoreCase("No")) break;

            Game game = new Game();

            while (game.getStatus()) {

                for (int i = 1; i < 3; i++) {
                    String response;
                    do { 
                        System.out.printf(PLAYER_PROMPT, i);
                        response = scanner.nextLine();
    
                    } while (!game.checkValid(response));

                    // Check for Victory
                    
                }

            }
            
        }
    }

}
