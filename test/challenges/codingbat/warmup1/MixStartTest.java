package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MixStartTest {

    @Test
    public void testMixStart() {
        System.out.println("mixStart");
        MixStart instance = new MixStart();
        assertEquals(true, instance.mixStart("mix snacks"));
        assertEquals(true, instance.mixStart("mix snacks"));
        assertEquals(false, instance.mixStart("piz snacks"));
        assertEquals(false, instance.mixStart(""));
        assertEquals(true, instance.mixStart("mix"));
        assertEquals(true, instance.mixStart("tix"));

    }

}
