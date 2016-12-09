package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 09..
 */
public class Enemy extends GameCharacter {

    private boolean[][] map;
    private String filename;

    public Enemy (String filename, int posX, int posY, boolean[][] map) {
        super(filename, posX, posY);
        this.posX = posX;
        this.posY = posY;
        this.map = map;
    }

    public Enemy(int HPmax, int DP, int SP) {
        super(dice(2), (dice(1) / 2), dice(1));

    }
}
