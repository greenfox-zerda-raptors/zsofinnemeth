import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class ImagePanel extends JFrame {

        private JMenuBar menuBar;
        private JMenu menu;
        private JMenuItem menuItem;

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    new ImagePanel().setVisible(true);
                }
            });
        }

        public ImagePanel() throws HeadlessException {
            setTitle("You draw shit but it's fun");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            setResizable(false);
            setSize(600, 600);
            Image kep = new ImageIcon("image.jpg").getImage();
            JPanel imagePanel = new JPanel();
//            Toolkit.getDefaultToolkit().createImage("image.jpg");
            getContentPane().add(imagePanel);



            //Create the menu bar.
            menuBar = new JMenuBar();

            //Build the first menu.
            menu = new JMenu("Menubar");
            menu.setMnemonic(KeyEvent.VK_V);
            menu.getAccessibleContext().setAccessibleDescription("nyunyi");
            menuBar.add(menu);

            menuItem = new JMenuItem("Exit", KeyEvent.VK_X);
            menu.add(menuItem);

            this.setJMenuBar(menuBar);
            this.setVisible(true);
        }
    }

