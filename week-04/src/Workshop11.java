/**
 * Created by false on 2016. 11. 08..
 */
import java.util.*;

public class Workshop11{
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("first", "second", "third", "fourth", "fifth"));
        // Print all elements of the list
        for (String listElements : list) {
            System.out.println(listElements);
        }
    }
}
