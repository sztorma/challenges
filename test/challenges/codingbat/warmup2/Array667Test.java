package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Array667Test {

    public Array667Test() {
    }

    @Test
    public void testArray667() {
        System.out.println("array667");
        Array667 instance = new Array667();
        assertEquals(1, instance.array667(new int[]{6, 6, 2}));
        assertEquals(1, instance.array667(new int[]{6, 6, 2, 6}));
        assertEquals(1, instance.array667(new int[]{6, 7, 2, 6}));
        assertEquals(2, instance.array667(new int[]{6, 7, 2, 6, 6}));
        assertEquals(0, instance.array667(new int[]{6}));
        assertEquals(0, instance.array667(new int[]{}));
        assertEquals(2, instance.array667(new int[]{6, 6, 2, 6, 7}));
    }

}
