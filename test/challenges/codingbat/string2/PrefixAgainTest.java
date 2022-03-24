package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrefixAgainTest {

    @Test
    public void testPrefixAgain() {
        PrefixAgain instance = new PrefixAgain();
        assertEquals(true, instance.prefixAgain("abXYabc", 1));
        assertEquals(true, instance.prefixAgain("abXYabc", 2));
        assertEquals(false, instance.prefixAgain("abXYabc", 3));
        assertEquals(false, instance.prefixAgain("k", 1));
    }
}
