/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import BoardGame.Board;
import BoardGame.Piece;
import BoardGame.Position;

/**
 *
 * @author Pires
 */
public class ChessPiece extends Piece{
    private Color color;

    public ChessPiece(Color color, Position position, Board board) {
        super(position, board);
        this.color = color;
    }



    public Color getColor() {
        return color;
    }

    
}
