package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MIssingCharTest {

    @Test
    public void testMissingChar() {
        System.out.println("missingChar");
        MIssingChar instance = new MIssingChar();
        assertEquals("ktten", instance.missingChar("kitten", 1));
        assertEquals("itten", instance.missingChar("kitten", 0));
        assertEquals("kittn", instance.missingChar("kitten", 4));
        assertEquals("", instance.missingChar("k", 0));
    }

}
