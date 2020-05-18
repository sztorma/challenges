package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LuckySumTest {

    public LuckySumTest() {
    }

    @Test
    public void testLuckySum() {
        System.out.println("luckySum");
        LuckySum instance = new LuckySum();
        assertEquals(6, instance.luckySum(1, 2, 3));
        assertEquals(3, instance.luckySum(1, 2, 13));
        assertEquals(1, instance.luckySum(1, 13, 3));
        assertEquals(0, instance.luckySum(13, 1, 3));
        assertEquals(0, instance.luckySum(13, 13, 13));
    }

}
