package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public class Hero extends GameCharacter {
    private String filename;

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.filename = "hero-down.png";
        this.posX = posX;
        this.posY = posY;

    }

    public void moveRight() {
        this.posX = posX+1;
        this.filename = "hero-right.png";
    }
    public void moveLeft() {
        this.posX = posX-1;
        this.filename = "hero-left.png";
    }
    public void moveUp() {
        this.posY = posY-1;
        this.filename = "hero-up.png";
    }
    public void moveDown() {
        this.posY = posY+1;
    }
}
