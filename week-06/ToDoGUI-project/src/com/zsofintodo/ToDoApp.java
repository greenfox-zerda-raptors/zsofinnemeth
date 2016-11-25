package com.zsofintodo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;


public class ToDoApp extends JFrame {
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;
    private JTextArea textArea;
    private JLabel labelWelcome, LabelMemory, labelInput;
    JScrollPane scrollPane;
    private String memory;

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

        // JLabel

        JLabel labelWelcome = new JLabel("");
        labelWelcome.setText("<html><body><center>Welcome to the place<br>where you can feel really busy<br>Please enter what-to-do: <br>( ͡° ᴥ ͡°)</center></body></html>");
        panel.add(labelWelcome);


        //Textfield for input

        JTextField textField = new JTextField(" ", 20);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             //   labelMemory.setText("Memory: " + memory);
                memory = textField.getText();
            }
        });

        panel.add(textField);

        // Textarea to list the to-dos

        JTextArea textArea = new JTextArea(10, 40);
        JScrollPane scrollPane = new JScrollPane(textArea);
        textArea.setFont(new Font("Sans Serif", Font.BOLD, 12));
        textArea.setText(textField.getText());
        panel.add(textArea);


        setJMenuBar(menuBar);
    }

}