package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TeenSumTest {

    public TeenSumTest() {
    }

    @Test
    public void testTeenSum() {
        System.out.println("teenSum");
        TeenSum instance = new TeenSum();
        assertEquals(7, instance.teenSum(3, 4));
        assertEquals(19, instance.teenSum(10, 13));
        assertEquals(19, instance.teenSum(13, 2));
        assertEquals(24, instance.teenSum(12, 12));
        assertEquals(40, instance.teenSum(20, 20));
        assertEquals(19, instance.teenSum(19, 20));
    }

}
