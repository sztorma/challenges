package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NearHundredTest {

    @Test
    public void testNearHundred() {
        System.out.println("nearHundred");
        NearHundred instance = new NearHundred();
        assertEquals(true, instance.nearHundred(93));
        assertEquals(true, instance.nearHundred(90));
        assertEquals(false, instance.nearHundred(89));
        assertEquals(true, instance.nearHundred(109));
        assertEquals(true, instance.nearHundred(190));
        assertEquals(true, instance.nearHundred(210));
        assertEquals(false, instance.nearHundred(211));
    }

}
