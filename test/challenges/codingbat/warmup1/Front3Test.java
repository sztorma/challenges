package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Front3Test {

    @Test
    public void testFront3() {
        System.out.println("front3");
        Front3 instance = new Front3();
        assertEquals("JavJavJav", instance.front3("Java"));
        assertEquals("ChoChoCho", instance.front3("Chocolate"));
        assertEquals("abcabcabc", instance.front3("abc"));
        assertEquals("momomo", instance.front3("mo"));
        assertEquals("", instance.front3(""));
    }

}
