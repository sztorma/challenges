package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Double23Test {

    public Double23Test() {
    }

    @Test
    public void testDouble23() {
        System.out.println("double23");
        Double23 instance = new Double23();
        assertEquals(true, instance.double23(new int[]{2, 2}));
        assertEquals(true, instance.double23(new int[]{3, 3}));
        assertEquals(false, instance.double23(new int[]{2, 3}));
        assertEquals(false, instance.double23(new int[]{2}));
        assertEquals(false, instance.double23(new int[]{}));
    }

}
