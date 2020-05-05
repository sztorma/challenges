package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeMiddleTest {

    public MakeMiddleTest() {
    }

    @Test
    public void testMakeMiddle() {
        System.out.println("makeMiddle");
        MakeMiddle instance = new MakeMiddle();
        assertArrayEquals(new int[]{2, 3}, instance.makeMiddle(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{2, 3}, instance.makeMiddle(new int[]{7, 1, 2, 3, 4, 9}));
        assertArrayEquals(new int[]{1, 2}, instance.makeMiddle(new int[]{1, 2}));
    }

}
