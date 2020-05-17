package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoneSumTest {

    public LoneSumTest() {
    }

    @Test
    public void testLoneSum() {
        System.out.println("loneSum");
        LoneSum instance = new LoneSum();
        assertEquals(6, instance.loneSum(1, 2, 3));
        assertEquals(2, instance.loneSum(3, 2, 3));
        assertEquals(0, instance.loneSum(3, 3, 3));
        assertEquals(2, instance.loneSum(2, 3, 3));
        assertEquals(2, instance.loneSum(3, 3, 2));
    }

}
