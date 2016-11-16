package main.java.music;

/**
 * Created by false on 2016. 11. 16..
 */
public class ElectricGuitar extends StringedInstrument {
        int numberOfStrings;

    public ElectricGuitar() {
    this(6);

    }


    public ElectricGuitar(int numberOfStrings) {

        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Electric Guitar, a " + numberOfStrings + "-stringed instrument that twangs.");
    }
}
