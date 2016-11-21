import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

/**
 * Created by false on 2016. 11. 21..
 */
public class AppleTest {
    @Test
    public void sum() throws Exception {
        Apple myApple = new Apple();
        myApple.add(1);
        myApple.add(2);
        myApple.add(3);
        assertEquals(6, myApple.sum());
    }

    @Test
    public void getName() throws Exception {
        Apple myObject = new Apple();
        assertEquals("apple", myObject.getName());
    }

}