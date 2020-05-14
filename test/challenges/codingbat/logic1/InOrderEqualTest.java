package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class InOrderEqualTest {

    public InOrderEqualTest() {
    }

    @Test
    public void testInOrderEqual() {
        System.out.println("inOrderEqual");
        InOrderEqual instance = new InOrderEqual();
        assertEquals(true, instance.inOrderEqual(2, 5, 11, false));
        assertEquals(false, instance.inOrderEqual(5, 7, 6, false));
        assertEquals(true, instance.inOrderEqual(5, 5, 7, true));
        assertEquals(false, instance.inOrderEqual(8, 7, 6, false));
        assertEquals(false, instance.inOrderEqual(5, 4, 7, true));
        assertEquals(false, instance.inOrderEqual(5, 5, 4, true));
    }

}
