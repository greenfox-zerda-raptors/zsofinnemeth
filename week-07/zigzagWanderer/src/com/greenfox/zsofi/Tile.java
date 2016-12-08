package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public abstract class Tile extends GameObject {
    boolean isMoveable;

    public Tile(String filename, int posX, int posY, boolean isMoveable) {

        super(filename, posX, posY);
        this.isMoveable = isMoveable;
    }
}
