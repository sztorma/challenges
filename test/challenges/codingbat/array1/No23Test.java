package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class No23Test {

    public No23Test() {
    }

    @Test
    public void testNo23() {
        System.out.println("no23");
        No23 instance = new No23();
        assertEquals(true, instance.no23(new int[]{4, 5}));
        assertEquals(false, instance.no23(new int[]{4, 2}));
        assertEquals(false, instance.no23(new int[]{3, 5}));
    }

}
