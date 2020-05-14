package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class InOrderTest {

    public InOrderTest() {
    }

    @Test
    public void testInOrder() {
        System.out.println("inOrder");
        InOrder instance = new InOrder();
        assertEquals(true, instance.inOrder(1, 2, 4, false));
        assertEquals(false, instance.inOrder(1, 2, 1, false));
        assertEquals(true, instance.inOrder(1, 1, 2, true));
        assertEquals(false, instance.inOrder(1, 3, 2, true));
    }

}
