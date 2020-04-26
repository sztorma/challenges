package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Max1020Test {

    public Max1020Test() {
    }

    @Test
    public void testMax1020() {
        System.out.println("max1020");
        Max1020 instance = new Max1020();
        assertEquals(11, instance.max1020(11, 9));
        assertEquals(19, instance.max1020(19, 11));
        assertEquals(11, instance.max1020(11, 9));
        assertEquals(0, instance.max1020(22, 9));
        assertEquals(10, instance.max1020(21, 10));
    }

}
