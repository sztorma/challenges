package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MidThreeTest {

    public MidThreeTest() {
    }

    @Test
    public void testMidThree() {
        System.out.println("midThree");
        MidThree instance = new MidThree();
        assertArrayEquals(new int[]{2, 3, 4}, instance.midThree(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{7, 5, 3}, instance.midThree(new int[]{8, 6, 7, 5, 3, 0, 9}));
        assertArrayEquals(new int[]{1, 2, 3}, instance.midThree(new int[]{1, 2, 3}));
    }

}
