import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by false on 2016. 11. 21..
 */
public class FibonacciTest {
    @Test
    public void fibonacci() throws Exception {
    assertEquals(2178309, Fibonacci.fibonacci(32));
    }

}