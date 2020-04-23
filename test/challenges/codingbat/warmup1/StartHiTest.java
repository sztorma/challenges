package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StartHiTest {

    @Test
    public void testStartHi() {
        System.out.println("startHi");
        StartHi instance = new StartHi();
        assertEquals(true, instance.startHi("hi there"));
        assertEquals(true, instance.startHi("hi"));
        assertEquals(false, instance.startHi("HI"));
        assertEquals(false, instance.startHi(" hi"));
        assertEquals(false, instance.startHi("hello hi"));
        assertEquals(false, instance.startHi("h"));
    }

}
