package program;

public class ComputerPlayer {

    public ComputerPlayer(TicTacToeBoard ticTacToeBoard) {
        this.ticTacToeBoard = ticTacToeBoard;
    }

    TicTacToeBoard ticTacToeBoard;


    public void makeMove(){
        for(int col=0; col<3;col++){
            for(int row=0; row<3;row++){
                if(ticTacToeBoard.getPiece(col,row) == null){
                    ticTacToeBoard.setPiece(new Piece("O"),col,row);
                    return;
                }
            }
        }
        // næste skridt: lav tilfældigt træk.
    }
}
