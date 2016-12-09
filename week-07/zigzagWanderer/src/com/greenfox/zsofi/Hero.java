package com.greenfox.zsofi;

import java.util.Map;

public class Hero extends GameCharacter {
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private String filename;
    private int maxHP;
    private int currentHP;
    private boolean[][] map;
    private Tile tile;

    public Hero(String filename, int posX, int posY, boolean[][] map) {
        super(filename, posX, posY);
        this.filename = filename;
        this.posX = posX;
        this.posY = posY;
        this.map = map;
    }

    public Hero() {
        super((20 + dice(3)), dice(2),  (5 + dice(1)));
        this.filename = "hero-down.png";
    }


    public void moveRight() {
        if (posX < 7) {
            if (!(map[posX + 1][posY])) {
                this.setFilename("hero-right.png");
                this.posX = posX + 1;
            }
        }
    }

    public void moveLeft() {
        if (posX > 0) {
            if (!(map[posX - 1][posY])) {
                this.posX = posX - 1;
            }
        }
    }
    public void moveUp() {
        if (posY > 0) {
            if (!(map[posX][posY - 1])) {
                this.posY = posY - 1;
            }
        }
    }
    public void moveDown() {
        if (posY < 8) {
            if (!(map[posX][posY + 1])) {
                this.posY = posY + 1;
            }
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
