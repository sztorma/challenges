package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Front11Test {

    public Front11Test() {
    }

    @Test
    public void testFront11() {
        System.out.println("front11");
        Front11 instance = new Front11();
        assertArrayEquals(new int[]{1, 7}, instance.front11(new int[]{1, 2, 3}, new int[]{7, 9, 8}));
        assertArrayEquals(new int[]{1, 2}, instance.front11(new int[]{1}, new int[]{2}));
        assertArrayEquals(new int[]{1}, instance.front11(new int[]{1, 7}, new int[]{}));
        assertArrayEquals(new int[]{}, instance.front11(new int[]{}, new int[]{}));
    }

}
