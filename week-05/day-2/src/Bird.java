/**
 * Created by false on 2016. 11. 15..
 */
public class Bird extends Animal {

    public Bird() {
        super(15, true);
        lifeExpectancy = 2;
        isCarnivore = false;
        System.out.println("Bird is created");
    }
    public void speak() {
        System.out.println("Bird chirps");
    }
    public void sleep() {
        System.out.println("Bird sleeps");
    }
    public void fly() { System.out.println("Bird can fly");
    }
}
