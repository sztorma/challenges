package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class HasBadTest {

    public HasBadTest() {
    }

    @Test
    public void testHasBad() {
        System.out.println("hasBad");
        HasBad instance = new HasBad();
        assertEquals(true, instance.hasBad("badxx"));
        assertEquals(true, instance.hasBad("xbadxx"));
        assertEquals(false, instance.hasBad("xxbadxx"));
        assertEquals(false, instance.hasBad("ba"));
        assertEquals(false, instance.hasBad("b"));
        assertEquals(false, instance.hasBad(""));
        assertEquals(false, instance.hasBad("xba"));
        assertEquals(false, instance.hasBad("bax"));
    }

}
