package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class Array123Test {

    public Array123Test() {
    }

    @Test
    public void testArray123() {
        System.out.println("array123");
        Array123 instance = new Array123();
        assertEquals(true, instance.array123(new int[]{1, 1, 2, 3, 1}));
        assertEquals(false, instance.array123(new int[]{1, 1, 2, 4, 1}));
        assertEquals(true, instance.array123(new int[]{1, 1, 2, 1, 2, 3}));
        assertEquals(true, instance.array123(new int[]{1, 2, 3, 9, 9, 9}));
        assertEquals(false, instance.array123(new int[]{}));
        assertEquals(false, instance.array123(new int[]{1, 2}));
    }

}
