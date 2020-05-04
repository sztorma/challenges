package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Reverse3Test {

    public Reverse3Test() {
    }

    @Test
    public void testReverse3() {
        System.out.println("reverse3");
        Reverse3 instance = new Reverse3();
        assertArrayEquals(new int[]{3, 2, 1}, instance.reverse3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{9, 11, 5}, instance.reverse3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{7, 0, 0}, instance.reverse3(new int[]{0, 0, 7}));
    }

}
