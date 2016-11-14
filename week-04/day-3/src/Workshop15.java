/**
 * Created by false on 2016. 11. 10..
 */
import java.util.Scanner;
import java.io.*;
public class Workshop15 {
    public static void main(String[] args) {

        System.out.println("Enter the file path, or q to Quit");

        Scanner userInput = new Scanner(System.in);
        String filePath;

        System.out.print("File path: ");

        while(userInput.hasNextLine()){
            filePath = userInput.nextLine();
            if(filePath.equals("q"))
                break;
            printFileContent(filePath);
            System.out.print("File path: ");
        }
    }

    private static void printFileContent (String filePath)  {

        try {
            BufferedReader in = new BufferedReader(new FileReader(filePath));
            String content = in.readLine();
            while (content != null) {
                System.out.println(content);
                content = in.readLine();
            }
            in.close();
        } catch (FileNotFoundException e1) {
            System.out.println("The specified path does not exists!");
        } catch (IOException e2) {
        System.out.println("The specified thing does not exists!");
    } catch (Exception e3) {
        System.out.println("The specified thing does not exists!");
    }

        // Implement this function
    // Open and read the file and print it's content to the standard output
    // If a specified path does not exist write "The specified path does not exists!"
}
}