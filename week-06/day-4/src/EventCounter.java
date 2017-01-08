
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.*;

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
        this.setLocationRelativeTo(null);
        setResizable(false);
        setSize(450, 200);
        addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                windowEvents++;
                updateWindowEventCounter();
            }

            @Override
            public void windowClosing(WindowEvent e) {
                updateWindowEventCounter();
            }

            @Override
            public void windowClosed(WindowEvent e) {
                updateWindowEventCounter();
            }

            @Override
            public void windowIconified(WindowEvent e) {
                windowEvents++;
                updateWindowEventCounter();
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                windowEvents++;
                updateWindowEventCounter();
            }

            @Override
            public void windowActivated(WindowEvent e) {
                windowEvents++;
                updateWindowEventCounter();
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                windowEvents++;
                updateWindowEventCounter();
            }
        });

        JPanel panel = new JPanel();
        getContentPane().add(panel);

// Event Counter LABELS:

        MouseEventCounterLabel = new JLabel("Mouse Event Counter: ");
        panel.add(MouseEventCounterLabel);
        MouseEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(MouseEventCounterLabel);


        KeyEventCounterLabel = new JLabel("Key Event Counter: ");
        panel.add(KeyEventCounterLabel);
        KeyEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(KeyEventCounterLabel);


        WindowEventCounterLabel = new JLabel("Window Event Counter: ");
        panel.add(WindowEventCounterLabel);
        WindowEventCounterLabel.setPreferredSize(
                new Dimension(200, 30));
        panel.add(WindowEventCounterLabel);


        // Textfield

        JTextField textField = new JTextField(" ", 15);
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                keyEvents++;
                updateKeyEventCounter();
            }
        });
        textField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                mouseEvents++;
                updateMouseEventCounter();
            }
        });
        textField.setColumns(10);
        textField.setText("");
        textField.setVisible(true);
        panel.add(textField);


        this.setVisible(true);

    }

       // Updating Counters:

    private void updateKeyEventCounter() {
        KeyEventCounterLabel.setText("Key Event Counter: " + keyEvents);
    }
    private void updateMouseEventCounter() {
        MouseEventCounterLabel.setText("Mouse Event Counter: " + mouseEvents);
    }
    private void updateWindowEventCounter() {
        WindowEventCounterLabel.setText("Window Event Counter: " + windowEvents);
    }



}
