package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public class Skeleton extends Enemy {
    private String filename;
    public Skeleton(String filename, int posX, int posY, boolean[][] map) {
        super(filename, posX, posY, map);
        this.filename = "skeleton.png";
        this.posX = posX;
        this.posY = posY;
    }
    public Skeleton(int HPmax, int DP, int SP) {
        super(dice(2), (dice(1) / 2), dice(1));
    }

}
