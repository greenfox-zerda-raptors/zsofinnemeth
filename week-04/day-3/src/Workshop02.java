/**
 * Created by false on 2016. 11. 09..
 */
/**************************************************************************************************
 * Workshop: Practice Exceptions: Read past the end of an array
 *
 * Welcome to crap coding by a mentor week!
 *
 * You have an array and the program tries to read past the end.  How do you ensure that you
 * still get to the ::::FINISH LINE::::? without changing the "for loop"'s "<=".
 *
 * Hint, you're studying try/catch/finally.
 *
 * The output should be
 * 0=one
 * 1=two
 * 2=three
 * 3=four
 * 4=
 * EXCEPTION and something like ArrayIndexOutOfBoundsException (I cannot remember exactly)
 * ::::FINISH LINE::::
 *
 * Again, don't change the loop exit condition!  This is solvable using Exception Handling.
 **************************************************************************************************/
import java.util.*;
import java.io.*;

public class Workshop02 {
    public static void main(String[] args) {
        String[] numbers = new String[]{"one", "two", "three", "four", "five"};

        for (int i = 0; i <= numbers.length; i++) {
            try {
                System.out.print(i);
                System.out.print("=" + numbers[i] + "\n");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("=Sorry, you cannot do that.");
            }
        }
        System.out.println("::::FINISH LINE::::");
    }
}
