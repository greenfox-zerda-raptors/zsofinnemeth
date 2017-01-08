import java.util.Arrays;

/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop14{
    public static void main(String[] args) {
        // Reverse the order of ah
        int[] ah = new int[]  { 3, 4, 5, 6, 7 };

        for(int i=ah.length; i>-1;i--){
            System.out.print(ah[i-1]);
        }

    }
}