package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class IcyHotTest {

    @Test
    public void testIcyHot() {
        System.out.println("icyHot");
        IcyHot instance = new IcyHot();
        assertEquals(true, instance.icyHot(120, -1));
        assertEquals(true, instance.icyHot(-1, 120));
        assertEquals(false, instance.icyHot(2, 120));
    }

}
