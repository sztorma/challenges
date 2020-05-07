package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Make2Test {

    public Make2Test() {
    }

    @Test
    public void testMake2() {
        System.out.println("make2");
        Make2 instance = new Make2();
        assertArrayEquals(new int[]{4, 5}, instance.make2(new int[]{4, 5}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{4, 1}, instance.make2(new int[]{4}, new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 2}, instance.make2(new int[]{}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, instance.make2(new int[]{1}, new int[]{2}));
    }

}
