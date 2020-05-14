package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class WithoutDoublesTest {

    public WithoutDoublesTest() {
    }

    @Test
    public void testWithoutDoubles() {
        System.out.println("withoutDoubles");
        WithoutDoubles instance = new WithoutDoubles();
        assertEquals(5, instance.withoutDoubles(2, 3, true));
        assertEquals(7, instance.withoutDoubles(3, 3, true));
        assertEquals(6, instance.withoutDoubles(3, 3, false));
        assertEquals(4, instance.withoutDoubles(3, 1, false));
        assertEquals(7, instance.withoutDoubles(6, 6, true));
    }

}
