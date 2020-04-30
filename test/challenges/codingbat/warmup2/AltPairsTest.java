package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class AltPairsTest {

    public AltPairsTest() {
    }

    @Test
    public void testAltPairs() {
        System.out.println("altPairs");
        AltPairs instance = new AltPairs();
        assertEquals("kien", instance.altPairs("kitten"));
        assertEquals("Chole", instance.altPairs("Chocolate"));
        assertEquals("Congrr", instance.altPairs("CodingHorror"));
        assertEquals("ba", instance.altPairs("ba"));
        assertEquals("ba", instance.altPairs("bal"));
        assertEquals("balatonn", instance.altPairs("basslasstossnn"));
        assertEquals("", instance.altPairs(""));
        assertEquals("b", instance.altPairs("b"));
    }

}
