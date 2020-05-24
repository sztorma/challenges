package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleCharTest {

    public DoubleCharTest() {
    }

    @Test
    public void testDoubleChar() {
        System.out.println("doubleChar");
        DoubleChar instance = new DoubleChar();
        assertEquals("tthhee", instance.doubleChar("the"));
        assertEquals("AAAAbbbb", instance.doubleChar("AAbb"));
        assertEquals("HHii--TThheerree", instance.doubleChar("Hi-There"));
        assertEquals("", instance.doubleChar(""));
        assertEquals("aa", instance.doubleChar("a"));
    }

}
