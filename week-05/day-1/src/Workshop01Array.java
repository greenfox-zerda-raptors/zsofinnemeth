/**
 * Created by false on 2016. 11. 14..
 */

import java.lang.reflect.Array;
import java.util.*;
public class Workshop01Array {

    public static void main(String[] args) {
        String[] color = new String[] {"white", "blue", "red", "silver", "black", "green", "banana"};
        String[] typeCar = new String[] {"toyota", "mazda", "bmw", "vw", "opel", "suzuki", "ford", "mercedes"};
        Integer[] sizeEngine = new Integer[]{1100, 1400, 1600, 1800, 2500};

        ArrayList<Car> lsCars = new ArrayList<Car>();

        for(int j=0; j<40; j++) {
            Random rmd = new Random();
            int b = rmd.nextInt(7);
            int c = rmd.nextInt(8);
            int d = rmd.nextInt(5);

            Car car = new Car(color[b], typeCar[c], sizeEngine[d]);
            lsCars.add(j, car);
        }

            lsCars.get(1).drive(3);
            lsCars.get(2).drive(6);
            lsCars.get(3).drive(7);
    }
}
