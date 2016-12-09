package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public class Boss extends Enemy {
    private String filename;
    public Boss(String filename, int posX, int posY, boolean[][] map) {
        super(filename, posX, posY, map);
        this.filename = "boss.png";
        this.posX = posX;
        this.posY = posY;
    }
    public Boss(int HPmax, int DP, int SP) {
        super(dice(3), (dice(2) / 2), dice(1));
    }
}
