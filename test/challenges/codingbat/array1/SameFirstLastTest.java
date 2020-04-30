package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SameFirstLastTest {

    public SameFirstLastTest() {
    }

    @Test
    public void testSameFirstLast() {
        System.out.println("sameFirstLast");
        SameFirstLast instance = new SameFirstLast();
        assertEquals(false, instance.sameFirstLast(new int[]{1, 2, 3}));
        assertEquals(true, instance.sameFirstLast(new int[]{1, 2, 3, 1}));
        assertEquals(true, instance.sameFirstLast(new int[]{1, 2, 1}));
        assertEquals(true, instance.sameFirstLast(new int[]{1}));
        assertEquals(false, instance.sameFirstLast(new int[]{}));
    }

}
