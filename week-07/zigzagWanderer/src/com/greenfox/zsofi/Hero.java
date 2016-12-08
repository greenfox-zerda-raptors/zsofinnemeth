package com.greenfox.zsofi;

public class Hero extends GameCharacter {
    private String filename;

    public Hero(String filename, int posX, int posY) {
        super(filename, posX, posY);
        this.filename = filename;
        this.posX = posX;
        this.posY = posY;

    }

    public void moveRight() {
        if (posX < 7) {
            this.posX = posX + 1;
        }
    }
    public void moveLeft() {
        if (posX > 0) {
            this.posX = posX - 1;
        }
    }
    public void moveUp() {
        if (posY > 0) {
            this.posY = posY - 1;
        }
    }
    public void moveDown() {
        if (posY < 8) {
            this.posY = posY + 1;
        }
    }

    public void faceDirection(int i) {
        switch (i) {
            case 1: // move right
                this.filename = "hero-right.png";
                break;
            case 2: // move left
                this.filename = "hero-left.png";
                break;
            case 3: // move up
                this.filename = "hero-left.png";
                break;
            case 4:
                this.filename = "hero-down.png";
                break;
        }
    }

}
