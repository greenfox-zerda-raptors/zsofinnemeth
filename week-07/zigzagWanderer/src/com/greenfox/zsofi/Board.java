package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

/**
 * Created by aze on 2016.12.05..
 */
public class Board extends JComponent implements KeyListener{

    ArrayList<GameObject> gameObjects;

    public Hero getHero() {
        return hero;
    }

    private Hero hero;

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
        gameObjects = new ArrayList<>();
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j]) {
                    gameObjects.add(new Wall(i, j));
                } else {
                    gameObjects.add(new Floor(i, j));
                }
            }
        }
        hero = new Hero("hero-down.png", 0,0);
        gameObjects.add(hero);
        addKeyListener(this);

        // set the size of your draw board
        setPreferredSize(new Dimension(720, 720));
        setVisible(true);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            hero.moveRight();
            repaint();
        }
        if (e.getKeyCode()==KeyEvent.VK_LEFT) {
            hero.moveLeft();
            repaint();
        }
        if (e.getKeyCode()==KeyEvent.VK_UP) {
            hero.moveUp();
            repaint();
        }
        if (e.getKeyCode()==KeyEvent.VK_DOWN) {
            hero.moveDown();
            repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}