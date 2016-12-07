package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by aze on 2016.12.05..
 */
public class Board extends JComponent {

    ArrayList<GameObject> gameObjects;

    public Board() {
        boolean[][] map = new boolean[][] {
                {false, false, false, false, true, true, true, false, false},
                {true, false, false, false, true, true, false, false, true},
                {false, false, false, false, false, true, false, false, true},
                {false, false, true, false, false, false, false, false, false},
                {true, true, true, false, false, false, false, true, true},
                {false, false, false, false, false, false, false, true, true},
                {false, false, true, true, false, true, false, false, true},
                {false, false, true, true, false, true, false, false, false}
        };
        gameObjects = new ArrayList<GameObject>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }
        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
    }
}