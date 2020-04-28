package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringTimesTest {

    public StringTimesTest() {
    }

    @Test
    public void testStringTimes() {
        System.out.println("stringTimes");
        StringTimes instance = new StringTimes();
        assertEquals("HiHi", instance.stringTimes("Hi", 2));
        assertEquals("HiHiHi", instance.stringTimes("Hi", 3));
        assertEquals("Hi", instance.stringTimes("Hi", 1));
        assertEquals("", instance.stringTimes("", 2));
        assertEquals("ii", instance.stringTimes("i", 2));
        assertEquals("", instance.stringTimes("nulltimes", 0));
    }

}
