package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Close10Test {

    @Test
    public void testClose10() {
        System.out.println("close10");
        Close10 instance = new Close10();
        assertEquals(8, instance.close10(8, 13));
        assertEquals(8, instance.close10(13, 8));
        assertEquals(0, instance.close10(13, 7));
        assertEquals(0, instance.close10(-1, 21));
        assertEquals(10, instance.close10(10, 21));
        assertEquals(0, instance.close10(10, 10));
    }

}
