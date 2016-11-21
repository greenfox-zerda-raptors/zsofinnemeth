import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by false on 2016. 11. 21..
 */
public class TestZsofin {
    @Test
    public void countHowMany() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails aaaare soooo huge");
        assertEquals(7, wSource.countHowMany('a'));
    }
    @Test
    public void secondTest() throws Exception {
        WordToolbox wSource = new WordToolbox ("Tarzan's toenails are Me Tarzan and You Jane");
        assertEquals(8, wSource.countHowMany('a'));
    }

     @Test (timeout = 100)
      public void waitingItOut() throws Exception {
        waitingItOut();
     }

    @Test
    public void setS() throws Exception {

    }

    @Test
    public void getS() throws Exception {

    }

    @Test
    public void isAnAnagram() throws Exception {

    }

    @Test
    public void getStringHeld() throws Exception {

    }

    @Test
    public void setStringHeld() throws Exception {

    }

}
