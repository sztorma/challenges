package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class WithoutXTest {

    public WithoutXTest() {
    }

    @Test
    public void testWithoutX() {
        System.out.println("withoutX");
        WithoutX instance = new WithoutX();
        assertEquals("Hi", instance.withoutX("xHix"));
        assertEquals("Hi", instance.withoutX("xHi"));
        assertEquals("Hxi", instance.withoutX("Hxix"));
        assertEquals("b", instance.withoutX("xbx"));
        assertEquals("", instance.withoutX("xx"));
        assertEquals("bb", instance.withoutX("bb"));
        assertEquals("b", instance.withoutX("bx"));
        assertEquals("b", instance.withoutX("xb"));
        assertEquals("b", instance.withoutX("b"));
        assertEquals("", instance.withoutX("x"));
        assertEquals("", instance.withoutX(""));
    }

}
