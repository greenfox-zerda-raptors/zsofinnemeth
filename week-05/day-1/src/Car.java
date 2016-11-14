/**
 * Created by false on 2016. 11. 14..
 */
public class Car {
    private int sizeEngine;
    private int kmOdometer;
    private String color;
    private String typeCar;

    public Car(String typeCar, String color, int sizeEngine, int kmOdometer) {
        this.sizeEngine = sizeEngine;
        this.color = color;
        this.kmOdometer = kmOdometer;
        this.typeCar = typeCar;
    }
    public Car(String typeCar, String color) {
        this.sizeEngine = 1600;
        this.color = color;
        this.kmOdometer = 15;
        this.typeCar = typeCar;
    }
    public Car(int sizeEngine, int kmOdometer) {
        this.sizeEngine = sizeEngine;
        this.color = "red";
        this.kmOdometer = kmOdometer;
        this.typeCar = "Mazda";
    }



    public void drive(int clicks) {
        kmOdometer += clicks;


        if (clicks < 20) {
            System.out.printf("Brrm, the %s %s just drove around town %d clicks.\n", color, typeCar, clicks);
        } else if (clicks < 50) {
            System.out.printf("Brrm, screech, brrm, screech; the %s %s commuted %d clicks.\n", color, typeCar, clicks);
        } else {
            System.out.printf("Whee, the %s %s %d clicks.\n", color, typeCar, clicks);
        }
        System.out.printf("The %s %s odometer now shows %d.\n", color, typeCar, kmOdometer);

    }

     public String toString() {
     return "This " + typeCar + " is " + color + ", has " + sizeEngine + " cc engine and clocked " + kmOdometer + " km's.";
    }

    public int getSizeEngine() {
        return sizeEngine;
    }

    public int getKmOdometer() {
        return kmOdometer;
    }

    public String getColor() {
        return color;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setSizeEngine(int sizeEngine) {
        this.sizeEngine = sizeEngine;
    }

    public void setKmOdometer(int kmOdometer) {
        this.kmOdometer = kmOdometer;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

}