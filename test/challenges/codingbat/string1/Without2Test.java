package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Without2Test {

    public Without2Test() {
    }

    @Test
    public void testWithout2() {
        System.out.println("without2");
        Without2 instance = new Without2();
        assertEquals("lloHe", instance.without2("HelloHe"));
        assertEquals("HelloHi", instance.without2("HelloHi"));
        assertEquals("", instance.without2("hi"));
        assertEquals("b", instance.without2("bbb"));
        assertEquals("he", instance.without2("hehe"));
        assertEquals("x", instance.without2("x"));
        assertEquals("", instance.without2(""));
    }

}
