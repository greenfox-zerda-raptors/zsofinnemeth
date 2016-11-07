/**
 * Created by false on 2016. 11. 07..
 */
public class pl {
    public static void main(String... args) {
        // create a function which prints the input String parameters (can have multiple number of arguments)

        printing("bla", "blabla", "blablabla");
    }

    public static void printing(String... input) {
        for(String s : input) {
            System.out.println(s);
//            System.out.println(input);
        }
    }

}

