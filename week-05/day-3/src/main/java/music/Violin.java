package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class Violin extends StringedInstrument {
    private static final String instrumentName = "Violin";

    public Violin() {
       super("violin", 4);
    }
    public Violin(int numberOfStrings) {
        super(instrumentName, numberOfStrings);
    }

    @Override
    public void play() {
        System.out.printf(formatForPlay, name, numberOfStrings, sound());
        // it's okay to add the sound of the instrument to the print but you can make a method for it, or a field
    }
    @Override
            public String sound() {
            return "screech";
        }

}
