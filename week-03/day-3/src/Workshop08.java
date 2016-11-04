import java.util.Arrays;

public class Workshop08 {
            public static void main(String[] args) {
                // Task 1: Create (dynamically) a two dimensional array with the following matrix. Use a loop!
                // 1 0 0 0
                // 0 1 0 0
                // 0 0 1 0
                // 0 0 0 1

                // Task 2: Print this two dimensional array to the output
//                int rows = 4;
//                int columns = 4;
                int[][] xy = new int[4][4];

                for (int i = 0; i < 4; i++) {
                    String out = "";
                    for (int j = 0; j < 4; j++){
                        if (i == j) {
                            xy[i][j] = 1;
                        }
                        out += xy[i][j];

                    }
                    System.out.println(out);
                }

            }
        }

