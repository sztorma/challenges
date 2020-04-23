package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumDoubleTest {

    @Test
    public void testSumDouble() {
        System.out.println("sumDouble");
        SumDouble instance = new SumDouble();
        assertEquals(3, instance.sumDouble(1, 2));
        assertEquals(5, instance.sumDouble(3, 2));
        assertEquals(8, instance.sumDouble(2, 2));
        assertEquals(0, instance.sumDouble(0, 0));
        assertEquals(1, instance.sumDouble(1, 0));
        assertEquals(-9, instance.sumDouble(-5, -4));
        assertEquals(-20, instance.sumDouble(-5, -5));
    }

}
