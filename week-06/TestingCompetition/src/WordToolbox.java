/**
 * Created by false on 2016. 11. 21..
 */
public class WordToolbox {
    private String stringHeld;
    private boolean happy = false;

    public int countHowMany(char c) {
        int counter = 0;
        for (int i=0; i<stringHeld.length(); i++) {
            if (stringHeld.charAt(i) == c) {
                counter++;
            }
        }
        return counter;
    }

    public void setS(String s) {

    }
    public String getS() {
        return stringHeld;
    }

    public boolean isAnAnagram(String stringToCheck) throws Exception {
        return true;
    }

    public void WaitingItOut() {
        while (!happy) {
            // do nothing
        }
    }

    public String getStringHeld() {
        return stringHeld;
    }

    public void setStringHeld(String stringHeld) {
        this.stringHeld = stringHeld;
    }

    public WordToolbox(String stringHeld) {
        this.stringHeld = stringHeld;
    }

}
