package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public class Skeleton extends GameCharacter {
    private String filename;
    public Skeleton(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.filename = "skeleton.png";
        this.posX = posX;
        this.posY = posY;
    }

}
