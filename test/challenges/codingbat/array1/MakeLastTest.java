package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeLastTest {

    public MakeLastTest() {
    }

    @Test
    public void testMakeLast() {
        System.out.println("makeLast");
        MakeLast instance = new MakeLast();
        assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, instance.makeLast(new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{0, 0, 0, 2}, instance.makeLast(new int[]{1, 2}));
        assertArrayEquals(new int[]{0, 3}, instance.makeLast(new int[]{3}));
    }

}
