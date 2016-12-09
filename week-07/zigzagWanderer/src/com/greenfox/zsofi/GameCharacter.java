package com.greenfox.zsofi;

import java.util.Random;

/**
 * Created by false on 2016. 12. 07..
 */
public class GameCharacter extends GameObject {
    protected int HPcurrent;
    protected int HPmax;
    protected int SP; // strike point
    protected int DP; // defense point
    protected boolean isDead;
    private boolean[][] map;

    public GameCharacter(String filename, int posX, int posY) {

        super(filename, posX, posY);
    }


    public GameCharacter(int HPmax, int DP, int SP) {
        this.HPmax = HPmax;
        this.HPcurrent = HPmax;
        this.DP = DP;
        this.SP = SP;
        this.isDead = false;
    }
    public static int dice(int numberOfDice) {
        int count = 0;
        Random rm = new Random();
        for (int i = 0; i <= numberOfDice; i++) {
            count += (1 + rm.nextInt(6));
        }
        return count;
    }
}
