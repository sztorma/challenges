package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CommonEndTest {

    public CommonEndTest() {
    }

    @Test
    public void testCommonEnd() {
        System.out.println("commonEnd");
        CommonEnd instance = new CommonEnd();
        assertEquals(true, instance.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        assertEquals(false, instance.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        assertEquals(true, instance.commonEnd(new int[]{1, 2, 3}, new int[]{1, 31}));
        assertEquals(true, instance.commonEnd(new int[]{1}, new int[]{1}));
        assertEquals(false, instance.commonEnd(new int[]{2}, new int[]{1}));
    }

}
