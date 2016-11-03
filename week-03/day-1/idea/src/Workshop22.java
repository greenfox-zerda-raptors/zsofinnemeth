/**
 * Created by false on 2016. 11. 03..
 */
public class Workshop22{
    public static void main(String... args){
        String first = "I am the first string!";
        String second = "I think I'm longer than first..";

        // Decide if "first" string is longer than "second" string and store it in a variable
        // Print the value of the variable

        int firstLength = first.length();
        int secondLength = second.length();

        if (firstLength > secondLength) {
            System.out.println("The first string is longer: "+ (firstLength)+ " characters.");
        }
        else if (firstLength < secondLength) {
            System.out.println("The second string is longer: "+ (secondLength) + " characters.");
        }

//
    }
}