package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringSplosionTest {

    public StringSplosionTest() {
    }

    @Test
    public void testStringSplosion() {
        System.out.println("stringSplosion");
        StringSplosion instance = new StringSplosion();
        assertEquals("CCoCodCode", instance.stringSplosion("Code"));
        assertEquals("aababc", instance.stringSplosion("abc"));
        assertEquals("aab", instance.stringSplosion("ab"));
        assertEquals("l", instance.stringSplosion("l"));
        assertEquals("", instance.stringSplosion(""));
    }

}
