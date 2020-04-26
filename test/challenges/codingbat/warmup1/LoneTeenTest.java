package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoneTeenTest {

    @Test
    public void testLoneTeen() {
        System.out.println("loneTeen");
        LoneTeen instance = new LoneTeen();
        assertEquals(true, instance.loneTeen(13, 99));
        assertEquals(true, instance.loneTeen(21, 19));
        assertEquals(false, instance.loneTeen(13, 13));
        assertEquals(false, instance.loneTeen(15, 15));
    }

}
