package com.greenfox.zsofi;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

        public static void main(String[] args) {

            JFrame frame = new JFrame(" ================= ୧༼ಠ益ಠ༽୨ ZIG ZAG WANDERER ୧༼ಠ益ಠ༽୨ ================= ");
            JPanel gamePanel = new JPanel();
            frame.add(gamePanel);
            gamePanel.setVisible(true);

            JPanel actionPanel = new JPanel();
            frame.add(actionPanel);
            actionPanel.setVisible(true);

            JLabel heroLabel = new JLabel("Hero HP: \n DP: \n SP: \n");
            heroLabel.setVisible(true);
            JLabel skeletonLabel = new JLabel("Skeleton HP: \n DP: \n SP: \n");
            skeletonLabel.setVisible(true);
            JLabel bossLabel = new JLabel("Boss HP: \n DP: \n SP: \n");
            heroLabel.setVisible(true);

            gamePanel.add(heroLabel);
            gamePanel.add(skeletonLabel);
            gamePanel.add(bossLabel);

            actionPanel.add(new Board());
            frame.pack();
            frame.setVisible(true);

        }

    }

