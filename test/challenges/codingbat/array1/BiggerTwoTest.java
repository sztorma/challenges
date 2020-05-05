package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class BiggerTwoTest {

    public BiggerTwoTest() {
    }

    @Test
    public void testBiggerTwo() {
        System.out.println("biggerTwo");
        BiggerTwo instance = new BiggerTwo();
        assertArrayEquals(new int[]{3, 4}, instance.biggerTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{3, 4}, instance.biggerTwo(new int[]{3, 4}, new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 2}, instance.biggerTwo(new int[]{1, 1}, new int[]{1, 2}));
        assertArrayEquals(new int[]{2, 3}, instance.biggerTwo(new int[]{2, 3}, new int[]{1, 4}));
        assertArrayEquals(new int[]{1, 4}, instance.biggerTwo(new int[]{1, 4}, new int[]{2, 3}));
    }

}
