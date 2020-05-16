package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SumLimitTest {

    public SumLimitTest() {
    }

    @Test
    public void testSumLimit() {
        System.out.println("sumLimit");
        SumLimit instance = new SumLimit();
        assertEquals(5, instance.sumLimit(2, 3));
        assertEquals(8, instance.sumLimit(8, 3));
        assertEquals(9, instance.sumLimit(8, 1));
        assertEquals(8, instance.sumLimit(8, 2));
    }

}
