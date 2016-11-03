/**
 * Created by false on 2016. 11. 03..
 */
public class Workshop34 {
    public static void main(String[] args) {
        // Write a program that prints the numbers from 1 to 100.
        // But for multiples of three print "Fizz" instead of the number
        // and for the multiples of five print "Buzz".
        // For numbers which are multiples of both three and five print "FizzBuzz".
         int k = 0;
        while (k <= 100) {
            System.out.println(k);
            k += 1;
            if (k%3 == 0) {
                System.out.println("Fizz");
            }
            if (k%5 == 0) {
                System.out.println("Buzz");
            }
            if (k%5 == 0 && k%3 == 0)
                System.out.println("FizzBuzz");
        }

    }
}
