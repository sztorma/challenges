package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringXTest {

    public StringXTest() {
    }

    @Test
    public void testStringX() {
        System.out.println("stringX");
        StringX instance = new StringX();
        assertEquals("xHix", instance.stringX("xxHxix"));
        assertEquals("abcd", instance.stringX("abxxxcd"));
        assertEquals("xabcdx", instance.stringX("xabxxxcdx"));
        assertEquals("xx", instance.stringX("xx"));
        assertEquals("x", instance.stringX("x"));
        assertEquals("a", instance.stringX("a"));
        assertEquals("", instance.stringX(""));
        assertEquals("xa", instance.stringX("xa"));
        assertEquals("ax", instance.stringX("ax"));
    }

}
