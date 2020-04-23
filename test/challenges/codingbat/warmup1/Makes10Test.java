package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Makes10Test {

    @Test
    public void testMakes10() {
        System.out.println("makes10");
        Makes10 instance = new Makes10();
        assertEquals(true, instance.makes10(9, 10));
        assertEquals(false, instance.makes10(9, 9));
        assertEquals(true, instance.makes10(1, 9));
        assertEquals(false, instance.makes10(-100, -9));
        assertEquals(true, instance.makes10(-10, 20));
    }

}
