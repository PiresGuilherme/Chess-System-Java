/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess.system.java;

import BoardGame.Board;
import chess.ChessMatch;
/**
 *
 * @author Pires
 */
public class ChessSystemJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            ChessMatch chessMatch = new ChessMatch();
            UI.printBoard(chessMatch.getPieces());
    }
    
}
