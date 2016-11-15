import javax.swing.*;

/**
 * Created by false on 2016. 11. 15..
 */
public class Animal {

    int lifeExpectancy;
    boolean isCarnivore;

    public Animal() {
        System.out.println("Animal is created.");
    }

    public Animal(String type) {
             System.out.println(type + " animal is created");
    }
    public void eat() {
        System.out.println("Animal eats");
    }
    public void sleep () { System.out.println("Animal sleeps"); }
    public void nightyNight()  {
        eat();
        sleep();
    }


}
