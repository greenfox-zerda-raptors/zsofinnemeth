
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;

import javax.swing.*;


public class HalloWorld extends JFrame {

        String[] hellos = new String[]{"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour", "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit", "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej", "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};

    public static void main(String[] args){
        new HalloWorld();
    }

    public HalloWorld() {
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define the title for the frame

        this.setTitle("Hallo World");

        // The JPanel contains all of the components for your frame

        JPanel thePanel = new JPanel();

        JLabel label1 = new JLabel("My first label");
        label1.setText("Hallo World");
        label1.setToolTipText("Go away XD");
        thePanel.add(label1);

        for(String hello:hellos) {
            thePanel.add(new JLabel(hello));
        }

//        JLabel label2 = new JLabel(Arrays.toString(hellos));
//        label1.setToolTipText("You fool");
//        thePanel.add(label2);

        this.add(thePanel);
        this.setVisible(true);
    }

}