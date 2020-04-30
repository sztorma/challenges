package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringYakTest {

    public StringYakTest() {
    }

    @Test
    public void testStringYak() {
        System.out.println("stringYak");
        StringYak instance = new StringYak();
        assertEquals("pak", instance.stringYak("yakpak"));
        assertEquals("pak", instance.stringYak("pakyak"));
        assertEquals("123ya", instance.stringYak("yak123ya"));
        assertEquals("y", instance.stringYak("y"));
        assertEquals("ya", instance.stringYak("ya"));
        assertEquals("", instance.stringYak("yak"));
        assertEquals("", instance.stringYak("yOk"));
    }

}
