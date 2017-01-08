package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument {
    private static final String instrumentName = "Electric bass guitar";
    // constructor:
    public ElectricBassGuitar() {
        super("electric bass guitar", 4);
    }
    public ElectricBassGuitar(int numberOfStrings) {
        super(instrumentName, numberOfStrings);
    }

    //methods:
    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound());
        // it's okay to add the sound of the instrument to the print but you can make a method for it, or a field
    }
    @Override
    public String sound() {
        return "dumm dummmmm dummm";
    }

}