package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class NoTeenSumTest {

    public NoTeenSumTest() {
    }

    @Test
    public void testNoTeenSum() {
        System.out.println("noTeenSum");
        NoTeenSum instance = new NoTeenSum();
        assertEquals(6, instance.noTeenSum(1, 2, 3));
        assertEquals(3, instance.noTeenSum(2, 13, 1));
        assertEquals(3, instance.noTeenSum(2, 1, 14));
        assertEquals(0, instance.noTeenSum(13, 13, 13));
        assertEquals(0, instance.noTeenSum(14, 14, 14));
        assertEquals(45, instance.noTeenSum(15, 15, 15));
        assertEquals(130, instance.noTeenSum(15, 15, 100));
        assertEquals(48, instance.noTeenSum(16, 16, 16));
        assertEquals(0, instance.noTeenSum(17, 17, 17));
        assertEquals(170, instance.noTeenSum(17, 170, 17));
        assertEquals(0, instance.noTeenSum(18, 18, 18));
        assertEquals(0, instance.noTeenSum(19, 19, 19));
        assertEquals(60, instance.noTeenSum(20, 20, 20));
    }

}
