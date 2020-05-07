package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class DeFrontTest {

    public DeFrontTest() {
    }

    @Test
    public void testDeFront() {
        System.out.println("deFront");
        DeFront instance = new DeFront();
        assertEquals("llo", instance.deFront("Hello"));
        assertEquals("va", instance.deFront("java"));
        assertEquals("aay", instance.deFront("away"));
        assertEquals("bi", instance.deFront("ebi"));
        assertEquals("", instance.deFront(""));
        assertEquals("a", instance.deFront("a"));
        assertEquals("a", instance.deFront("al"));
        assertEquals("as", instance.deFront("als"));
        assertEquals("", instance.deFront("b"));
        assertEquals("ab", instance.deFront("ab"));
        assertEquals("abc", instance.deFront("abc"));
    }

}
