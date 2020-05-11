package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SortaSumTest {

    public SortaSumTest() {
    }

    @Test
    public void testSortaSum() {
        System.out.println("sortaSum");
        SortaSum instance = new SortaSum();
        assertEquals(7, instance.sortaSum(3, 4));
        assertEquals(20, instance.sortaSum(9, 4));
        assertEquals(21, instance.sortaSum(10, 11));
        assertEquals(9, instance.sortaSum(1, 8));
        assertEquals(20, instance.sortaSum(1, 9));
        assertEquals(20, instance.sortaSum(1, 10));
        assertEquals(20, instance.sortaSum(10, 9));
        assertEquals(20, instance.sortaSum(10, 10));
    }

}
