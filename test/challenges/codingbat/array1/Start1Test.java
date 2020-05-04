package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Start1Test {

    public Start1Test() {
    }

    @Test
    public void testStart1() {
        System.out.println("start1");
        Start1 instance = new Start1();
        assertEquals(2, instance.start1(new int[]{1, 2, 3}, new int[]{1, 3}));
        assertEquals(1, instance.start1(new int[]{7, 2, 3}, new int[]{1}));
        assertEquals(1, instance.start1(new int[]{1, 2}, new int[]{}));
        assertEquals(0, instance.start1(new int[]{5, 2, 3}, new int[]{7, 3}));
        assertEquals(0, instance.start1(new int[]{}, new int[]{}));
    }

}
