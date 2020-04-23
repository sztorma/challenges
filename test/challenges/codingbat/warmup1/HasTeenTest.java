package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class HasTeenTest {

    @Test
    public void testHasTeen() {
        System.out.println("hasTeen");
        HasTeen instance = new HasTeen();
        assertEquals(true, instance.hasTeen(13, 20, 10));
        assertEquals(true, instance.hasTeen(20, 19, 10));
        assertEquals(true, instance.hasTeen(20, 10, 13));
        assertEquals(false, instance.hasTeen(20, 10, 12));
    }

}
