package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SwapEndsTest {

    public SwapEndsTest() {
    }

    @Test
    public void testSwapEnds() {
        System.out.println("swapEnds");
        SwapEnds instance = new SwapEnds();
        assertArrayEquals(new int[]{4, 2, 3, 1}, instance.swapEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{3, 2, 1}, instance.swapEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{5, 6, 7, 9, 8}, instance.swapEnds(new int[]{8, 6, 7, 9, 5}));
        assertArrayEquals(new int[]{23}, instance.swapEnds(new int[]{23}));
    }

}
