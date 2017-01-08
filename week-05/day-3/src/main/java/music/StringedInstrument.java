package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public abstract class StringedInstrument extends Instrument {

    protected int numberOfStrings;
    final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

// constructor: (you can work without this but then you have to set these at all places later.. )
    public StringedInstrument(String name, int numberOfStrings) {
        super(name);
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound());
        // it's okay to add the sound of the instrument to the print but you can make a method for it, or a field
    }
}
