package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SleepInTest {

    @Test
    public void testSleepIn() {
        System.out.println("sleepIn");
        SleepIn instance = new SleepIn();
        assertEquals(true, instance.sleepIn(true, true));
        assertEquals(true, instance.sleepIn(false, true));
        assertEquals(false, instance.sleepIn(true, false));
        assertEquals(true, instance.sleepIn(false, false));
    }

}
