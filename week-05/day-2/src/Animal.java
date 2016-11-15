/**
 * Created by false on 2016. 11. 15..
 */
public class Animal {

    int lifeExpectancy;
    boolean isCarnivore;
    boolean hasTail;

    public Animal(int i, boolean b) {
        System.out.println("Animal is created.");
        lifeExpectancy = 10;
        isCarnivore = false;
    }
    public Animal(int lifeExpectancy, boolean isCarnivore, boolean hasTail ) {
        this.hasTail = hasTail;
        this.lifeExpectancy = lifeExpectancy;
        this.isCarnivore = isCarnivore;
        System.out.println("Animal is created.");
    }
    public void speak() { System.out.println("Animal speaks");}
    public String toString() {
        return "isCarnivore=%b, lifeExpectancy=%d";
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
