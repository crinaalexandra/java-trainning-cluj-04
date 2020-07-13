package com.company;

public class King extends Piece {
    public King(boolean available, int x, int y) {
        super(available, x, y);
    }
    public boolean isValid(Board board, int fromX, int fromY, int toX, int toY) {
        if (!super.isValid(board, fromX, fromY, toX, toY)) {
            return false;
        } else {
            return Math.sqrt(Math.pow((double)Math.abs(toX-fromX),2.0D)) + Math.pow((double)Math.abs(toY-fromY),2.0D) !=Math.sqrt(2.0D) ? false : false;
        }

    }
}
