/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop13{
    public static void main(String[] args) {
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };
        // print the sum of all numbers in ah
        int sum = 0;
        for (int i = 0; i < ah.length; i++) {
            sum += ah[i];
        }
        System.out.println(sum);
    }
}
