import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WrapperApp extends JFrame {

    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem menuItem;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new WrapperApp().setVisible(true);
            }
        });
    }

    public WrapperApp() throws HeadlessException {
        setTitle("Your New Favorite Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setLocationRelativeTo(null);
        setResizable(false);
        setSize(500, 500);


        JPanel panel = new JPanel();
        getContentPane().add(panel);

        //Create the menu bar.
        menuBar = new JMenuBar();

        //Build the first menu.
        menu = new JMenu("Menubar");
        menu.setMnemonic(KeyEvent.VK_V);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of JMenuItems

        menuItem = new JMenuItem(new ImageIcon("507.png"));
        menuItem.setMnemonic(KeyEvent.VK_S);
        menu.add(menuItem);
        menuItem = new JMenuItem("Exit", KeyEvent.VK_S);
        menuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menu.add(menuItem);

        setJMenuBar(menuBar);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }
}
