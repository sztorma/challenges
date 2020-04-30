package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class NoTriplesTest {

    public NoTriplesTest() {
    }

    @Test
    public void testNoTriples() {
        System.out.println("noTriples with while");
        NoTriples instance = new NoTriples();
        assertEquals(true, instance.noTriples(new int[]{1, 1, 2, 2, 1}));
        assertEquals(false, instance.noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        assertEquals(false, instance.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertEquals(true, instance.noTriples(new int[]{}));
        assertEquals(true, instance.noTriples(new int[]{1}));
        assertEquals(true, instance.noTriples(new int[]{1, 2}));
        assertEquals(true, instance.noTriples(new int[]{1, 2, 3}));
        assertEquals(false, instance.noTriples(new int[]{1, 1, 1}));
        assertEquals(false, instance.noTriples(new int[]{3, 4, 5, 6, 8, 1, 1, 1}));
    }

    @Test
    public void testNoTriples2() {
        System.out.println("noTriples with for");
        NoTriples instance = new NoTriples();
        assertEquals(true, instance.noTriples2(new int[]{1, 1, 2, 2, 1}));
        assertEquals(false, instance.noTriples2(new int[]{1, 1, 2, 2, 2, 1}));
        assertEquals(false, instance.noTriples2(new int[]{1, 1, 1, 2, 2, 2, 1}));
        assertEquals(true, instance.noTriples2(new int[]{}));
        assertEquals(true, instance.noTriples2(new int[]{1}));
        assertEquals(true, instance.noTriples2(new int[]{1, 2}));
        assertEquals(true, instance.noTriples2(new int[]{1, 2, 3}));
        assertEquals(false, instance.noTriples2(new int[]{1, 1, 1}));
        assertEquals(false, instance.noTriples2(new int[]{3, 4, 5, 6, 8, 1, 1, 1}));
    }

}
