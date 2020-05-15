package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxMod5Test {

    public MaxMod5Test() {
    }

    @Test
    public void testMaxMod5() {
        System.out.println("maxMod5");
        MaxMod5 instance = new MaxMod5();
        assertEquals(3, instance.maxMod5(2, 3));
        assertEquals(6, instance.maxMod5(6, 2));
        assertEquals(3, instance.maxMod5(3, 2));
        assertEquals(0, instance.maxMod5(3, 3));
        assertEquals(7, instance.maxMod5(12, 7));
        assertEquals(7, instance.maxMod5(7, 12));
    }

}
