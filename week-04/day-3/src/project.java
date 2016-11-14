import java.util.Scanner;
import java.util.*;
/**
 * Created by false on 2016. 11. 10..
 */

public class project {

    static Scanner userInput = new Scanner(System.in);

    public static void main (String[] args) {
        boolean flLoop = true;
        while (flLoop) {
            try {
                occurencePrinter();
            } catch (InputMismatchException e) {
                System.out.println("Sorry, invalid value");

            }
            userInput.nextLine();
        }
    }

        public static void occurencePrinter() {
            System.out.println("Please enter the numbers of dice sides (divided with a whitespace). \nPress 0 to quit.");
            int kockA = userInput.nextInt();
            if (kockA == 0) {
                System.out.println("Bye");
                System.exit(0);
            }
            int kockB = userInput.nextInt();

            int maxSum = kockA + kockB;
            int[] resultOccurrence = new int[maxSum - 1];
            for (int i = 1; i <= kockA; i++) {
                for (int j = 1; j <= kockB; j++) {
                    resultOccurrence[i + j - 2]++;
                }
            }

            int count = 2;
            System.out.println("sum       occurs      probability");
            for (int i : resultOccurrence) {
                System.out.print(count);
                System.out.print("           ");
                System.out.print(i);
                System.out.print("           ");
                System.out.print((float) i / (kockA * kockB) * 100);
                System.out.println("%");
                count++;
            }

        }
}