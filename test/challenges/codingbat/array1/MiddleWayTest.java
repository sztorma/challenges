package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MiddleWayTest {

    public MiddleWayTest() {
    }

    @Test
    public void testMiddleWay() {
        System.out.println("middleWay");
        MiddleWay instance = new MiddleWay();
        assertArrayEquals(new int[]{2, 5}, instance.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6}));
        assertArrayEquals(new int[]{7, 8}, instance.middleWay(new int[]{7, 7, 7}, new int[]{3, 8, 0}));
        assertArrayEquals(new int[]{2, 4}, instance.middleWay(new int[]{5, 2, 9}, new int[]{1, 4, 5}));
    }

}
