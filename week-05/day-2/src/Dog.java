/**
 * Created by false on 2016. 11. 15..
 */
public class Dog extends Animal {

    boolean hasTail;
    public void speak() { System.out.println("Dog barks");}
    public void beg() { System.out.println("Dog begs");}

    public Dog() {
        super(15, true);
        this.hasTail = true;
        System.out.println("Dog is created");
    }
}
