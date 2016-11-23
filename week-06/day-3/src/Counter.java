import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame {

    private JButton buttonCounter, buttonReset;
    private JLabel labelCount;

    private int clicks = 0;

    public Counter() {
        createView();

        setTitle("Basic Example Application");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(400, 100);
    }

    public class ButtonCounterActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            clicks++;
            updateCounter();
        }
    }

    public void createView() {
        JPanel panel = new JPanel();
        getContentPane().add(panel);

        buttonCounter = new JButton("Press me");
        buttonCounter.addActionListener(new ButtonCounterActionListener());
        panel.add(buttonCounter);

        labelCount = new JLabel();
        panel.add(labelCount);
        labelCount.setPreferredSize(
                new Dimension(200, 30));
        panel.add(labelCount);
        updateCounter();

        buttonReset = new JButton("Reset");
        buttonReset.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        clicks =0;
                        updateCounter();
                    }
                });
        panel.add(buttonReset);
    }

    private void updateCounter() { // it updates the text on the counter
        labelCount.setText("Pressed" + clicks);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Counter().setVisible(true);
            }
        });
    }

}
