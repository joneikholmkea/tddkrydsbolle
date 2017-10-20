package program;

public class TicTacToeBoard {
    Piece[][] board = new Piece[3][3];


    public Piece getPiece(int x, int y){
        return board[x][y];
    }
    public boolean someoneWon(){
        return false;
    }

    public boolean isBoardFull(){

        return false;
    }

    public boolean setPiece(Piece piece, int x, int y){
        System.out.println("set Piece kaldt med x,y " + x + " " + y);
        if(board[x][y]!=null) {
            return false;
        }else{
            board[x][y] = piece;
            return true;
        }

    }

    public void showBoard(){
        // udskriv hele board arrayet
    }
}
