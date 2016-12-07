package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public class Boss extends GameCharacter {
    private String filename;
    public Boss(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.filename = "boss.png";
        this.posX = posX;
        this.posY = posY;
    }
}
