import java.util.Arrays;
import java.util.Collections;

/**
 * Created by false on 2016. 11. 04..
 */
public class Workshop12{
    public static void main(String[] args) {
        // Swap the first element of the array
        // Expected output: third second first
//        String[] abc = new String[] { "first", "second", "third" }

        String[] abc = { "first", "second", "third" };

        Arrays.sort(abc, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        System.out.println(Arrays.toString(abc));
    }
}