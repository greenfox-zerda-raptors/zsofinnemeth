package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public abstract class Instrument {
    // field: this comes first in any class
    protected String name;

    public abstract void play();
    // method for making a sound:
    public abstract String sound();

    // constructor:
    public Instrument(String name) {
        this.name = name;
    }
}
