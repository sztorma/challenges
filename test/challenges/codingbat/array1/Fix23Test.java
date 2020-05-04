package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Fix23Test {

    public Fix23Test() {
    }

    @Test
    public void testFix23() {
        System.out.println("fix23");
        Fix23 instance = new Fix23();
        assertArrayEquals(new int[]{1, 2, 0}, instance.fix23(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 0, 5}, instance.fix23(new int[]{2, 3, 5}));
        assertArrayEquals(new int[]{1, 2, 1}, instance.fix23(new int[]{1, 2, 1}));
    }

}
