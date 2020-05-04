package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComboStringTest {

    public ComboStringTest() {
    }

    @Test
    public void testComboString() {
        System.out.println("comboString");
        ComboString instance = new ComboString();
        assertEquals("hiHellohi", instance.comboString("Hello", "hi"));
        assertEquals("hiHellohi", instance.comboString("hi", "Hello"));
        assertEquals("baaab", instance.comboString("aaa", "b"));
        assertEquals("aaa", instance.comboString("aaa", ""));
        assertEquals("b", instance.comboString("", "b"));
    }

}
