package com.company;

public class Tile {
    int x;
    int y;
    Piece piece;

    public Tile(int x, int y) {
        super();
        this.x = x;
        this.y = y;
        piece = null;
    }

    public void occupySpot(Piece piece){
        if(this.piece != null)
            this.piece.setAvailable(false);
        this.piece = piece;
    }

    public boolean isOccupied() {
        if(piece != null)
            return true;
        return false;
    }

    public Piece releaseTile() {
        Piece releasedPiece = this.piece;
        this.piece = null;
        return releasedPiece;
    }

    public static void occupyTile(Piece piece) {
    }
}
