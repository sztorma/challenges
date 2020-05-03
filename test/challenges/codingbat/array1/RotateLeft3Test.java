package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class RotateLeft3Test {

    public RotateLeft3Test() {
    }

    @Test
    public void testRotateLeft3() {
        System.out.println("rotateLeft3");
        RotateLeft3 instance = new RotateLeft3();
        assertArrayEquals(new int[]{2, 3, 1}, instance.rotateLeft3(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{11, 9, 5}, instance.rotateLeft3(new int[]{5, 11, 9}));
        assertArrayEquals(new int[]{0, 0, 7}, instance.rotateLeft3(new int[]{7, 0, 0}));
    }

}
