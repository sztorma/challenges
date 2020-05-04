package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Has23Test {

    public Has23Test() {
    }

    @Test
    public void testHas23() {
        System.out.println("has23");
        Has23 instance = new Has23();
        assertEquals(true, instance.has23(new int[]{2, 5}));
        assertEquals(true, instance.has23(new int[]{4, 3}));
        assertEquals(false, instance.has23(new int[]{4, 5}));
    }

}
