package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
public abstract class GameCharacter extends GameObject {
    int HP; // health point
    int DP; // defend point
    int SP; // strike point
    public GameCharacter(String filename, int posX, int posY) {
        super(filename, posX, posY);
    }


}
