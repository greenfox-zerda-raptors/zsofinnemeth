import java.util.Scanner;
import java.util.*;
/**
 * Created by false on 2016. 11. 10..
 */
public class Workshop08 {

    public static void myMethod(int testnum) throws Exception // something should appear here before
    {
        if (testnum == 7) {
            throw new Exception("You are fired!!");// do that thing that chucks the reprobate out
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
                finally{
                    System.out.println("Finally I did this instead");
                }
            } //try-catch
        } // while
        System.out.println("You fool!9999999dfgdl999?????");
    } //main
} //workshop