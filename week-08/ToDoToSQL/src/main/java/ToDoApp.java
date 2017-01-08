/**
 * Created by false on 2016. 12. 16..
 */
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.SQLException;
import java.util.*;

public class ToDoApp extends JFrame {
    String name;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JTextArea textArea;
    JTextField textField;
    JLabel labelWelcome, LabelMemory, labelInput;
    JScrollPane scrollPane;
    String input;
    Dao<ToDoItem, String> toDoDao;
    java.util.List<ToDoItem> tdlist = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/tasks?user=root&password=BA71367VZ6kQcz7p&useSSL=false";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

        TableUtils.createTableIfNotExists(connectionSource, ToDoItem.class);

        Dao<ToDoItem, String> toDoDao = DaoManager.createDao(connectionSource, ToDoItem.class);


        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToDoApp(toDoDao).setVisible(true);
            }
        });
    }

    public ToDoApp(Dao<ToDoItem, String> toDoDao) throws HeadlessException {
        this.toDoDao = toDoDao;
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
        setJMenuBar(menuBar);

        //MENUUUUUUUUUUUUUUUUUU
        menu = new JMenu("Load to-dos");
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reloadItems();

            }
        });
        menuBar.add(menu);
        menu = new JMenu("Save to-dos");
        menuBar.add(menu);
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
        labelWelcome.setText("<html><body><center>Welcome to the place<br>where you can feel really busy <br>( ͡° ᴥ ͡°)</center></body></html>");
        panel.add(labelWelcome);

        // Textarea to list the to-dos

        textArea = new JTextArea(10, 40);
        textArea.setFont(new Font("Sans Serif", Font.BOLD, 12));
        panel.add(textArea);


        //Textfield for input

        final JTextField textField = new JTextField(" ", 20);
        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToDoItem item = new ToDoItem(textField.getText());
                tdlist.add(item);
                listItems();
                textField.setText("");
                try {
                    toDoDao.create(item);
                } catch (SQLException e1) {
                    e1.printStackTrace();
                }
            }
        });
        panel.add(textField);
    }

    // ------------ METHODS ------------


    public void listItems() {
        textArea.setText(" ");
        for (int i = 0; i < tdlist.size(); i++) {
            textArea.append(i + 1 + " - " + tdlist.get(i).toString() + " \n ");
        }
    }

    public void reloadItems() {
          tdlist.clear();
        try {
            tdlist = toDoDao.queryForAll();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}