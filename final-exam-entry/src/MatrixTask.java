/**
 * Created by false on 2017. 02. 17..
 */

//6.
//
//        Create a function that takes a number returns a matrix (list of lists) with height and width as the number, all of it's elments should be zero, beside the main diagonal should be ones like:
//
//        1 0 0 0 0
//        0 1 0 0 0
//        0 0 1 0 0
//        0 0 0 1 0
//        0 0 0 0 1


public class MatrixTask {

    public static void main(String[] args) {
        String stringOne = "1";
        String stringZero = "0";
        int l = 4;
        for (int i = 0; i < l; i++) {
            String out = stringZero;
            for (int j = 0; j < l; j++){
                if (j == l)
                {
                 out += stringOne;

                }
                else
                {
                 out += stringZero;
                }
            }
            System.out.println(out);
        }

    }
}
