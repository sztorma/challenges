package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class IntMaxTest {

    @Test
    public void testIntMax() {
        System.out.println("intMax");
        IntMax instance = new IntMax();
        assertEquals(3, instance.intMax(1, 2, 3));
        assertEquals(3, instance.intMax(1, 3, 2));
        assertEquals(3, instance.intMax(3, 2, 1));
        assertEquals(4, instance.intMax(1, 1, 4));
        assertEquals(4, instance.intMax(4, 1, 1));
    }

}
