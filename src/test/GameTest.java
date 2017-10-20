package test;

import org.junit.Before;
import org.junit.Test;
import program.Game;
import program.Piece;
import program.TicTacToeBoard;

import static org.junit.Assert.*;

public class GameTest { // husk på GitHub !! og det første

    Game game;

    @Before
    public void setup(){
        game = new Game();
    }

    @Test
    public void testWhenPlayerGoesFirst(){
        game.playerMove(1,2);  // sætter en Piece
        TicTacToeBoard ticTacToeBoard = game.getTicTacToeBoard();
        Piece playerPiece = ticTacToeBoard.getPiece(1,2);
        assertNotNull(playerPiece);
        Piece computerPlayerPiece = ticTacToeBoard.getPiece(0,0);
        assertNotNull(computerPlayerPiece);
    }

}
