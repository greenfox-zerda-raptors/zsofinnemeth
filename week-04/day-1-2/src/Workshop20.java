/**
 * Created by false on 2016. 11. 07..
 */
public class Workshop20{
    public static void main(String... args){
        StringBuilder sb = new StringBuilder("second line\n");
        // Add "first line" to the beginning of the sb
        sb.insert(0, "first line\n");
        // Add "third line" to the end of the sb
        sb.append("third line\n");
        // Expected outpt:
        // first line
        // second line
        // third line


        System.out.println(sb.toString());
    }
}

