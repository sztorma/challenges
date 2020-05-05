package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoCharTest {

    public TwoCharTest() {
    }

    @Test
    public void testTwoChar() {
        System.out.println("twoChar");
        TwoChar instance = new TwoChar();
        assertEquals("ja", instance.twoChar("java", 0));
        assertEquals("va", instance.twoChar("java", 2));
        assertEquals("ja", instance.twoChar("java", 3));
        assertEquals("on", instance.twoChar("on", 3));
        assertEquals("on", instance.twoChar("on", -3));
    }

}
