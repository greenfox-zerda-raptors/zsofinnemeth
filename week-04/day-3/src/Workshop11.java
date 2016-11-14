/**
 * Created by false on 2016. 11. 10..
 */
import java.util.*;

public class Workshop11 {

    public static void myMethod(int testnum) throws Exception // something should appear here before
    {
        if (testnum == 7) {
            throw new Exception("You are fired!!");// do that thing that chucks the reprobate out
        }
        else if (testnum == 9) {
            throw new Exception("I hope you die");
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int age;
        String prompt = "Enter any number, 0 to exit?";

        System.out.println(prompt);
        while (userInput.hasNextInt()) {
            age = userInput.nextInt();
            if (age == 0) {
                break;
            } else {
                try {
                    System.out.println("try - first statement");
                    myMethod(age);
                    System.out.println("try - last statement");
                } catch (Exception ex) {
                    System.out.println("An Exception");
                    System.out.println(ex);
                }
            } //try-catch
        } // while
        System.out.println("You fool!9999999dfgdl999?????");
    } //main
} //workshop
