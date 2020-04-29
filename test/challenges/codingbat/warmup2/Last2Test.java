package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Last2Test {

    public Last2Test() {
    }

    @Test
    public void testLast2() {
        System.out.println("last2");
        Last2 instance = new Last2();
        assertEquals(1, instance.last2("hixxhi"));
        assertEquals(1, instance.last2("xaxxaxaxx"));
        assertEquals(2, instance.last2("axxxaaxx"));
        assertEquals(0, instance.last2("xx"));
        assertEquals(0, instance.last2("x"));
        assertEquals(3, instance.last2("hihihihi"));

    }

}
