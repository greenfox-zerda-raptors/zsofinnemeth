/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop21{
    public static void main(String[] args) {
        // create a recursive function that returns it's input factorial
        int a = 5;
        System.out.println(factorial(a));
    }
    public static int factorial (int i) {
        if (i == 1) return 1;
        return i * factorial(i-1);
    }
}
