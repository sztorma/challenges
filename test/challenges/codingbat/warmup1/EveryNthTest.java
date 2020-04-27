package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EveryNthTest {

    public EveryNthTest() {
    }

    @Test
    public void testEveryNth() {
        System.out.println("everyNth");
        EveryNth instance = new EveryNth();
        assertEquals("Mrce", instance.everyNth("Miracle", 2));
        assertEquals("aceg", instance.everyNth("abcdefg", 2));
        assertEquals("adg", instance.everyNth("abcdefg", 3));
        assertEquals("k", instance.everyNth("k", 3));
    }

}
