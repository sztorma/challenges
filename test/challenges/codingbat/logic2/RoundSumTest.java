package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoundSumTest {

    public RoundSumTest() {
    }

    @Test
    public void testRoundSum() {
        System.out.println("roundSum");
        RoundSum instance = new RoundSum();
        assertEquals(60, instance.roundSum(16, 17, 18));
        assertEquals(30, instance.roundSum(12, 13, 14));
        assertEquals(10, instance.roundSum(6, 4, 4));
        assertEquals(90, instance.roundSum(26, 27, 28));
        assertEquals(80, instance.roundSum(26, 21, 28));
        assertEquals(90, instance.roundSum(25, 25, 25));
        assertEquals(60, instance.roundSum(24, 24, 24));
    }

}
