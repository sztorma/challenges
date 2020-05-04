package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sum2Test {

    public Sum2Test() {
    }

    @Test
    public void testSum2() {
        System.out.println("sum2");
        Sum2 instance = new Sum2();
        assertEquals(3, instance.sum2(new int[]{1, 2, 3}));
        assertEquals(2, instance.sum2(new int[]{1, 1}));
        assertEquals(2, instance.sum2(new int[]{1, 1, 1, 1}));
        assertEquals(6, instance.sum2(new int[]{6}));
        assertEquals(0, instance.sum2(new int[]{}));
    }

}
