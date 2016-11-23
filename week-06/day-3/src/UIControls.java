import com.sun.deploy.panel.UpdatePanelImpl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Arrays;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class UIControls extends JFrame {
    private JLabel labelInput = new JLabel("Text: ");
    private JLabel labelMemory = new JLabel("Memory: ");
    private JPanel panel = new JPanel();
    String memory;


    public static void main(String[] args) {
        new UIControls();
    }

    public UIControls() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UI Controls sample");
        this.add(panel);


        JTextField textField1 = new JTextField(" ", 15);
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelMemory.setText("Memory: " + memory);
                labelInput.setText("Input: " + textField1.getText());
                memory = labelInput.getText();
            }
        });
        panel.add(labelInput);
        panel.add(labelMemory);
        JButton buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                    memory = " ";
                    labelMemory.setText("Memory: ");
                    labelInput.setText("Text: ");
                    }
                });
        panel.add(buttonReset);

        textField1.setColumns(10);
        textField1.setText("My actual input");
        textField1.setVisible(true);
        panel.add(textField1);
        this.setVisible(true);

    }

}


