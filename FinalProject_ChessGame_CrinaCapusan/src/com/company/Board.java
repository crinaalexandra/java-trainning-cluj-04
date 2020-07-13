package com.company;

public class Board {
    private Tile[][] tiles = new Tile[8][8];

    public Board() {
        super();
        for(int i=0; i<tiles.length; i++){
            for(int j=0; j<tiles.length; j++){
                this.tiles[i][j] = new Tile(i, j);
            }
        }
    }

    public Tile getTile(int x, int y) {
        return tiles[x][y];
    }

    public Tile getTile(Class<?> aClass, Class<?> aClass1) {
        return null;
    }
}
