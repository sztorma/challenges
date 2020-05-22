package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenlySpacedTest {

    public EvenlySpacedTest() {
    }

    @Test
    public void testEvenlySpaced() {
        System.out.println("evenlySpaced");
        EvenlySpaced instance = new EvenlySpaced();
        assertEquals(true, instance.evenlySpaced(2, 4, 6));
        assertEquals(true, instance.evenlySpaced(4, 6, 2));
        assertEquals(false, instance.evenlySpaced(4, 6, 3));
        assertEquals(true, instance.evenlySpaced(1, 1, 1));
        assertEquals(false, instance.evenlySpaced(1, 1, 2));
    }

}
