package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LastTwoTest {

    public LastTwoTest() {
    }

    @Test
    public void testLastTwo() {
        System.out.println("lastTwo");
        LastTwo instance = new LastTwo();
        assertEquals("codign", instance.lastTwo("coding"));
        assertEquals("cta", instance.lastTwo("cat"));
        assertEquals("ba", instance.lastTwo("ab"));
        assertEquals("a", instance.lastTwo("a"));
        assertEquals("", instance.lastTwo(""));
    }

}
