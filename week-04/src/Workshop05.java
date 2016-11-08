/**
 * Created by false on 2016. 11. 08..
 */
import java.util.*;

public class Workshop05{
    public static void main(String... args){
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(12, 1, 532, 23, 0, 7, 54, 32));
        // Copy every element of "numList" to an Array
        int a[] = new int[numList.size()];
        System.out.println(numList);

        for (int i=0; i<numList.size(); i++) {
            a[i] = numList.get(i);
        }
        for (int arrayListItems : a)  {
            System.out.println(arrayListItems);
        }
    }
}
