package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FirstLast6Test {

    public FirstLast6Test() {
    }

    @Test
    public void testFirstLast6() {
        System.out.println("firstLast6");
        FirstLast6 instance = new FirstLast6();
        assertEquals(true, instance.firstLast6(new int[]{1, 2, 6}));
        assertEquals(true, instance.firstLast6(new int[]{6, 1, 2, 3}));
        assertEquals(false, instance.firstLast6(new int[]{13, 6, 1, 2, 3}));
        assertEquals(false, instance.firstLast6(new int[]{1}));
        assertEquals(true, instance.firstLast6(new int[]{6}));
    }

}
