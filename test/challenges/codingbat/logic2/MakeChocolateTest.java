package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeChocolateTest {

    public MakeChocolateTest() {
    }

    @Test
    public void testMakeChocolate() {
        System.out.println("makeChocolate");
        MakeChocolate instance = new MakeChocolate();
        assertEquals(4, instance.makeChocolate(4, 1, 9));
        assertEquals(-1, instance.makeChocolate(4, 1, 10));
        assertEquals(2, instance.makeChocolate(4, 1, 7));
        assertEquals(13, instance.makeChocolate(13, 3, 28));
        assertEquals(-1, instance.makeChocolate(12, 3, 28));
        assertEquals(13, instance.makeChocolate(200, 3, 28));
        assertEquals(3, instance.makeChocolate(3, 30, 28));
        assertEquals(-1, instance.makeChocolate(2, 30, 28));
        assertEquals(3, instance.makeChocolate(30, 30, 28));
    }

}
