package com.greenfox.zsofi;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by false on 2016. 12. 08..
 */
public class GameLogic {

    /* hero attack ---- >  enemy HP-je lemegy, de vissza is üt, szóval a hero HP-je is lemegy

     */

    private Hero hero;
    private Skeleton skeletonOne;
    private Skeleton skeletonTwo;
    private Skeleton skeletonThree;
    private Boss boss;

    public GameLogic() {


    }
    public boolean checkIfEnemy(boolean[][] map, int posX, int posY) {

        return true;
    }

    public void attack() {
        ArrayList<Enemy> enemies = new ArrayList<>();
        enemies.add(skeletonOne);
        enemies.add(skeletonTwo);
        enemies.add(skeletonThree);
        enemies.add(boss);

    }

    public void getDead() {

    }


}
