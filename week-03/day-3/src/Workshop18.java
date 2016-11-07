/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop18{
    public static void main(String[] args) {
        // write a function that sum all the numbers until the given parameter
        int numbers = 10;
        System.out.println(sumNumbers(numbers));
    }

    public static int sumNumbers (int i) {
        int out = 0;
        for (int j = 1; j <= i; j++) {
            out += j;
        }
        return out;


    }
}
