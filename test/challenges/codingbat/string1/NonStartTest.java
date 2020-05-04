package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NonStartTest {

    public NonStartTest() {
    }

    @Test
    public void testNonStart() {
        System.out.println("nonStart");
        NonStart instance = new NonStart();
        assertEquals("ellohere", instance.nonStart("Hello", "There"));
        assertEquals("avaode", instance.nonStart("java", "code"));
        assertEquals("hotlava", instance.nonStart("shotl", "java"));
        assertEquals("", instance.nonStart("a", "b"));
    }

}
