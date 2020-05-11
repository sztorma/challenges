package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CaughtSpeedingTest {

    public CaughtSpeedingTest() {
    }

    @Test
    public void testCaughtSpeeding() {
        System.out.println("caughtSpeeding");
        CaughtSpeeding instance = new CaughtSpeeding();
        assertEquals(0, instance.caughtSpeeding(60, false));
        assertEquals(1, instance.caughtSpeeding(65, false));
        assertEquals(0, instance.caughtSpeeding(65, true));

        assertEquals(1, instance.caughtSpeeding(61, false));

        assertEquals(0, instance.caughtSpeeding(65, true));
        assertEquals(1, instance.caughtSpeeding(66, true));

        assertEquals(1, instance.caughtSpeeding(80, false));
        assertEquals(2, instance.caughtSpeeding(81, false));

        assertEquals(1, instance.caughtSpeeding(85, true));
        assertEquals(2, instance.caughtSpeeding(86, true));
    }

}
