/**
 * Created by false on 2016. 11. 14..
 */
public class Workshop01 {
    public static void main(String[] args) {
        Car myCar1 = new Car("Mazda", "red", 1600, 12312);
        Car myCar2 = new Car("Ford", "silver", 2500, 152312);
        Car myCar3 = new Car("Beamer", "green", 2800, 42521);
        Car myCar5 = new Car("Opel", "white", 1400, 25);
        Car myCar6 = new Car("VW", "grey");
        Car myCar7 = new Car(1100, 15);

        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar1.getTypeCar(), myCar1.getColor(), myCar1.getSizeEngine(),myCar1.getKmOdometer());
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar2.getTypeCar(), myCar2.getColor(), myCar2.getSizeEngine(),myCar2.getKmOdometer());
        System.out.printf("This %s is %s, has %d cc engine and clocked %d km's\n", myCar3.getTypeCar(), myCar3.getColor(), myCar3.getSizeEngine(),myCar3.getKmOdometer());

        System.out.println(myCar1.toString());
        System.out.println(myCar2.toString());
        System.out.println(myCar3.toString());
        System.out.println(myCar5.toString());
        System.out.println(myCar6.toString());
        System.out.println(myCar7.toString());

        myCar1.drive(15);
        myCar2.drive(45);
        myCar3.drive(60);
    }
}
