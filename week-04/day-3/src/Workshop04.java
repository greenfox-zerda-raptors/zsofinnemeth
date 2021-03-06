/**
 * Created by false on 2016. 11. 09..
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Cascading problems
 *
 * What if there are lots of different types of errors?
 *
 * We've got an array and a mad man writing idiotic code (me!).  Deal with my mayhem and get to
 * the ::::FINISH LINE::::
 *
 * Note that there should not be Compile Time errors.
 *
 **************************************************************************************************/
import java.util.*;

public class Workshop04 {
    public static void main(String[] args) {

        int a[] = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        String two = "2";
            System.out.println("Testing ...");
        try {
            a[2] = a[3] / a[0];
            System.out.println("Past hurdle 1");
        } catch (Exception e) {
        System.out.println("I'm sorry, Dave");
    }
        try {
            a[9] = Integer.parseInt(two);
            System.out.println("Past hurdle 2");
        } catch (Exception e) {
            System.out.println("I'm sorry, Dave");
        }
        try {
            a[10] = Integer.parseInt("ten");
            System.out.println("Past hurdle 3...  And I realized perhaps I'm wrong");
        } catch (Exception e) {
            System.out.println("I'm sorry, Dave");
        }
        try {
            a[10] = 10;
            System.out.println("Past hurdle 4");
        } catch (Exception e) {
            System.out.println("I'm sorry, Dave");
        }

        try {
            two = "two";
            System.out.println("Past hurdle 5");
            a[9] = Integer.parseInt(two);
        } catch (Exception e) {
            System.out.println("I'm sorry, Dave");
        }
        System.out.println("*** FINISH LINE ***");
    }
}