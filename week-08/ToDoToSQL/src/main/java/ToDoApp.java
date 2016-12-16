/**
 * Created by false on 2016. 12. 16..
 */
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class ToDoApp extends JFrame {
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    JTextArea textArea;
    JTextField textField;
    JLabel labelWelcome, LabelMemory, labelInput;
    JScrollPane scrollPane;
    String input;


    static ArrayList<ToDoItem> tdlist = new ArrayList<>();

    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://127.0.0.1:3306/tasks?user=root&password=BA71367VZ6kQcz7p&useSSL=false";
        ConnectionSource connectionSource = new JdbcConnectionSource(databaseUrl);

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
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveItems();
            }
        });

        menuBar.add(menu);
        menu = new JMenu("Remove to-do");
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("FILL ME PLEASE WITH THE SQL TABLE FILENAME"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String line = br.readLine();
            while (line != null) {
                // reading the next line
                ToDoItem bufftditem = new ToDoItem(line);
                tdlist.add(bufftditem);
                line = br.readLine();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void saveItems() {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("FILL ME PLEASE WITH THE SQL TABLE FILENAME"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            for (int i=0; i<tdlist.size(); i++) {
                bw.write(tdlist.get(i).toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}