package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Sum3Test {

    public Sum3Test() {
    }

    @Test
    public void testSum3() {
        System.out.println("sum3");
        Sum3 instance = new Sum3();
        assertEquals(6, instance.sum3(new int[]{1, 2, 3}));
        assertEquals(18, instance.sum3(new int[]{5, 11, 2}));
        assertEquals(7, instance.sum3(new int[]{7, 0, 0}));
    }

}
