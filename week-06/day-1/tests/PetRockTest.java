import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.junit.Assert.*;

/**
 * Created by false on 2016. 11. 20..
 */
public class PetRockTest {
    private PetRock rocky;
    // timeout for the whole class with @Rule
    @Rule
    public Timeout globalTimeOut = Timeout.seconds(10);


    // you can say @After as well, in case you want to run a test method after all other methods. You can say @BeforeClass too, in case you want to run it once before a certain class. This runs it before all the other:
    @Before
    public void myTestSetUp() throws Exception {
        rocky = new PetRock("Rocky");
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Rocky", rocky.getName());
    }

    @Test
    public void testUnhappyToStart() throws Exception {
        assertFalse(rocky.isHappy());
    }

    @Test
    public void testHappyAfterPlay() throws Exception {
    rocky.playWithRock();
        assertTrue(rocky.isHappy());
    }

    @Ignore("Exception throwing not yet defined")
    @Test (expected = IllegalStateException.class)
    public void nameFail() throws Exception {
    rocky.getHappyMessage();
    }

    @Test
    public void name() throws Exception {
        rocky.playWithRock();
        String msg = rocky.getHappyMessage();
        assertEquals("I'm happy.", msg);
    }

    @Test
    public void testFavNumber() throws Exception {
    assertEquals(42, rocky.getFavNumber());
    }

    @Test (expected = IllegalArgumentException.class)
    public void emptyNameFail() throws Exception {
    new PetRock("");
    }

    @Test (timeout = 100) // 100 is in miliseconds! it limits the time to run the test. you can set a timeout limit for the whole class, see above
    public void waitForHappyTimeout() throws Exception {
        rocky.waitTillHappy();
    }
}