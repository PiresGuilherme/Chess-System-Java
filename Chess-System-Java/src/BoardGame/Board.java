/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoardGame;

/**
 *
 * @author Pires
 */
public class Board {
    private int rows;
    private int columns;
    private Piece[][] Pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        Pieces = new Piece[rows][columns];
    }



    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
//
//    public Piece[][] getPiece() {
//        return Piece;
//    }
//
//    public void setPiece(Piece[][] Piece) {
//        this.Piece = Piece;
//    }
    
    
}
