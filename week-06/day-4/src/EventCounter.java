
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventCounter extends JFrame {
    private JTextField textField;
    private JLabel MouseEventCounterLabel, KeyEventCounterLabel, WindowEventCounterLabel;

    private int mouseEvents = 0;
    private int keyEvents = 0;
    private int windowEvents = 0;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventCounter().setVisible(true);
            }
        });
    }

    public EventCounter() {

        setTitle("Basic Example Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(450, 200);

        JPanel panel = new JPanel();
        getContentPane().add(panel);


// Event Counter LABELS:

        MouseEventCounterLabel = new JLabel("Mouse event counter");
        panel.add(MouseEventCounterLabel);
        MouseEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(MouseEventCounterLabel);


        KeyEventCounterLabel = new JLabel("Key event counter");
        panel.add(KeyEventCounterLabel);
        KeyEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(KeyEventCounterLabel);


        WindowEventCounterLabel = new JLabel("Window event counter");
        panel.add(WindowEventCounterLabel);
        WindowEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(WindowEventCounterLabel);


        // Textfield

        JTextField textField = new JTextField(" ", 15);
        textField.addKeyListener(new KeyListener() {
            @Override
            public void actionPerformed(KeyEvent e) {
                keyEvents++;
                updateKeyEventCounter();
            }
        });
        textField.setColumns(10);
        textField.setText("My actual input");
        textField.setVisible(true);
        panel.add(textField);


        this.setVisible(true);

    }

    // ActionListener methods:

    public class MouseEventCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            mouseEvents++;
            updateMouseEventCounter();
        }
    }
    public class ListenForKeys implements KeyListener {
        @Override
        public void actionPerformed(KeyEvent e) {
            keyEvents++;
            updateKeyEventCounter();
        }
    }
    public class WindowEventCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            windowEvents++;
            updateMouseEventCounter();
        }
    }


       // Updating Counters:
    private void updateKeyEventCounter() {
        KeyEventCounterLabel.setText("Pressed" + keyEvents);
    }



}
