package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class ElectricBassGuitar extends StringedInstrument {
    int numberOfStrings = 4;

    public ElectricBassGuitar() {
        this(4);

    }

    public ElectricBassGuitar(int numberOfStrings) {

        this.numberOfStrings = numberOfStrings;
    }
    public void play() {
        System.out.println("Bass Guitar, a " + numberOfStrings + "-stringed instrument that Duum-duum-duum.");
    }
}
