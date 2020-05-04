package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxEnd3Test {

    public MaxEnd3Test() {
    }

    @Test
    public void testMaxEnd3() {
        System.out.println("maxEnd3");
        MaxEnd3 instance = new MaxEnd3();
        assertArrayEquals(new int[]{3, 3, 3}, instance.maxEnd3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 11, 11}, instance.maxEnd3(new int[]{11, 5, 9}));
        assertArrayEquals(new int[]{3, 3, 3}, instance.maxEnd3(new int[]{2, 11, 3}));
        assertArrayEquals(new int[]{3, 3, 3}, instance.maxEnd3(new int[]{3, 11, 3}));
    }

}
