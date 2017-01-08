
package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class ElectricGuitar extends StringedInstrument {
 private static final String instrumentName = "Electric guitar";

    public ElectricGuitar() {
        super(instrumentName, 6);
    }
    public ElectricGuitar(int numberOfStrings) {
        super(instrumentName, numberOfStrings);
    }
    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound());
        // it's okay to add the sound of the instrument to the print but you can make a method for it, or a field
    }
    @Override
    public String sound() {
        return "twang";
    }

    public String smash() {
        return "tsssssssss....";
    }

}