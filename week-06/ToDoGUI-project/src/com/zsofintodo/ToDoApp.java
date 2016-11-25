package com.zsofintodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;


public class ToDoApp extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private JTextArea textArea;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoApp().setVisible(true);
            }
        });
    }
    public ToDoApp() throws HeadlessException {
        setTitle("TO DO APP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        setSize(500, 500);
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        setLocation(xPos, yPos);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);

        JPanel panel = new JPanel();
        getContentPane().add(panel);

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu and set the main menu with key shortcut 'M'
        menu = new JMenu("I'm tired of this");
        menuBar.add(menu);

        JMenuItem menuItem = new JMenuItem("Quit");
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuItem.setMnemonic(KeyEvent.VK_Q);
        menuItem.getAccessibleContext().setAccessibleDescription(" ");
        menu.add(menuItem);

        // Textarea to list the to-dos

        JTextArea textArea = new JTextArea(10,40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setFont(new Font("Sans Serif", Font.BOLD, 12));
        panel.add(textArea);



        this.setJMenuBar(menuBar);
    }
}