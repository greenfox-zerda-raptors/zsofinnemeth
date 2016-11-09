/**
 * Created by false on 2016. 11. 08..
 */
import java.util.*;

public class Workshop03{
    public static void main(String... args){
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("first", "second", "fourth"));
        // The "third" element is missing from the arrayList. Insert it into the arrayList between second and fourth
        arrayList.add(2, "second");
        System.out.println(arrayList);
    }
}

