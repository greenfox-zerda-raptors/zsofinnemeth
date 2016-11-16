package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class Violin extends StringedInstrument {
    int numberOfStrings = 4;
    public void play() {
        System.out.println("Violin, a " + numberOfStrings + "-stringed instrument that screeches.");
    }
}
