package com.greenfox.zsofi;

/**
 * Created by false on 2016. 12. 07..
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.border.BevelBorder;

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

        hero = new Hero("hero-down.png", 0,0, map);
        gameObjects.add(hero);
        Skeleton skeletonOne = new Skeleton("skeleton.png", 5, 5);
        gameObjects.add(skeletonOne);
        Skeleton skeletonTwo = new Skeleton("skeleton.png", 3, 7);
        gameObjects.add(skeletonTwo);
        Skeleton skeletonThree = new Skeleton("skeleton.png", 1, 3);
        gameObjects.add(skeletonThree);
        Boss boss = new Boss("boss.png", 7, 0);
        gameObjects.add(boss);
        addKeyListener(this);

        // set the size of your draw board
        setPreferredSize(new Dimension(700, 950));
        setVisible(true);
        setFocusable(true);
        JPanel gamePanel = new JPanel();
        gamePanel.setVisible(true);
        setPreferredSize(new Dimension(950, 650));

        //attempting to set a JPanel with JLabels for the gameCharacter stats - NOT functioning:
        JLabel heroLabel = new JLabel("Hero HP: \n DP: \n SP: \n");
        heroLabel.setVisible(true);
        JLabel skeletonLabel = new JLabel("Skeleton HP: \n DP: \n SP: \n");
        skeletonLabel.setVisible(true);
        JLabel bossLabel = new JLabel("Boss HP: \n DP: \n SP: \n");
        heroLabel.setVisible(true);
        gamePanel.add(heroLabel);
        gamePanel.add(skeletonLabel);
        gamePanel.add(bossLabel);

    }

    @Override
    public void paint(Graphics graphics) {
        // here you have a 720x720 canvas
        // you can create and draw an image using the class below e.g.

        for (GameObject gameObject : gameObjects) {
            gameObject.draw(graphics);
        }
    }


        // KEY LISTENERS

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
            hero.faceDirection(1);
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