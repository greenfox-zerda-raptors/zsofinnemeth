package com.greenfox.zsofi;

import javax.swing.*;

    public class Main extends JFrame {

        public static void main(String[] args) {
            JFrame frame = new JFrame();
            frame.add(new Board());
            frame.pack();
            frame.setVisible(true);
        }
    }