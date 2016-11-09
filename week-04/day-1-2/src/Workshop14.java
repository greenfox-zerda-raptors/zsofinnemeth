/**
 * Created by false on 2016. 11. 08..
 */
import java.util.*;

public class Workshop14{
    public static void main(String... args){
        ArrayList<String> al = new ArrayList<String>(Arrays.asList("kuty", "macsk", "kacs", "rók"));
        // Add "a" to every string in al. Use an iterator!
        ListIterator<String> iterator = al.listIterator();
        while (iterator.hasNext()) {
            String o = iterator.next();
            iterator.set(o + "a");
        }
        System.out.println(al);
    }
}
