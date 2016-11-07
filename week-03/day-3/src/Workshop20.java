/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop20{
    public static void main(String[] args) {
        // create a function that returns it's input factorial
        int numbers = 5;
        System.out.println(factorial(numbers));
    }
    public static int factorial (int i) {
        int out = 1;
        for (int j = 1; j <= i; j++) {
            out *= j;
        }
        return out;
    }
}