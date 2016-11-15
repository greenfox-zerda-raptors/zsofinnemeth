/**
 * Created by false on 2016. 11. 15..
 */
public class Workshop01 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
        bird.sleep();
        System.out.println(bird.lifeExpectancy);
        bird.speak();
        Animal animal = new Animal(15, true);
        animal.eat();
        animal.sleep();
        bird.nightyNight();
        Dog dog = new Dog();
        dog.speak();
        dog.beg();
         }
}
