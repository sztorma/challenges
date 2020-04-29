package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayCount9Test {

    public ArrayCount9Test() {
    }

    @Test
    public void testArrayCount9() {
        System.out.println("arrayCount9");
        ArrayCount9 instance = new ArrayCount9();
        assertEquals(1, instance.arrayCount9(new int[]{1, 2, 9}));
        assertEquals(2, instance.arrayCount9(new int[]{1, 9, 9}));
        assertEquals(3, instance.arrayCount9(new int[]{1, 2, 9, 3, 9, 9}));
    }

}
