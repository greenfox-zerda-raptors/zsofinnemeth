/**
 * Created by false on 2016. 11. 04..
 */
public class Workshop02{
    public static void main(String... args) {
        int[] p1 = new int[]{1, 2, 3};
        int[] p2 = new int[]{4, 5};
        // tell if p2 has more elements than p1
        if (p1.length > p2.length) {
            System.out.println("p1 has more elements");
        }
        if (p2.length > p1.length) {
            System.out.println("p2 has more elements");
        }
    }
}