package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class WithoutX2Test {

    public WithoutX2Test() {
    }

    @Test
    public void testWithoutX2() {
        System.out.println("withoutX2");
        WithoutX2 instance = new WithoutX2();
        assertEquals("Hi", instance.withoutX2("xHi"));
        assertEquals("Hi", instance.withoutX2("Hxi"));
        assertEquals("Hi", instance.withoutX2("Hi"));
        assertEquals("Hi", instance.withoutX2("xxHi"));
        assertEquals("", instance.withoutX2("xx"));
        assertEquals("", instance.withoutX2("x"));
        assertEquals("", instance.withoutX2(""));
    }

}
