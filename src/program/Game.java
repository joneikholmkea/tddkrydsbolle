package program;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Scanner;

public class Game {
    private Scanner scanner = new Scanner(System.in);

    public ComputerPlayer getComputerPlayer() {
        return computerPlayer;
    }

    private ComputerPlayer computerPlayer;

    public TicTacToeBoard getTicTacToeBoard() {
        return ticTacToeBoard;
    }

    private TicTacToeBoard ticTacToeBoard = new TicTacToeBoard();

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
        System.out.println("main er kaldt");
    }
    public Game(){
        computerPlayer = new ComputerPlayer(ticTacToeBoard);
    }

    private void start() {
        System.out.println("Velkommen. ");
        System.out.println("Hvem starter? p=player, c=computer");
        String svar = scanner.nextLine();
        if(svar.equalsIgnoreCase("p")){
            playerGoesFirst();
        }else  if(svar.equalsIgnoreCase("c")){
            // computer starter
        }
    }

    public void playerGoesFirst(){
        // 1. tag imod x,y
        System.out.println("indtast x,y");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        playerMove(x,y);
    }

    public void playerMove(int x, int y){
        Piece piece = new Piece("X");
        boolean result = ticTacToeBoard.setPiece(piece,x,y);
        computerPlayer.makeMove();
        // 4 Test om 2) og 3) er opfyldt.
    }
}
