import java.util.Arrays;

/**
 * Created by false on 2016. 11. 04..
 */
public class Workshop07{
    public static void main(String[] args) {
        // What's the problem with this code fragment? Fix it!
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = 1; i < array.length; i++) {
            array[i] = i * i;
            System.out.println(array[i]);
        }
    }
}