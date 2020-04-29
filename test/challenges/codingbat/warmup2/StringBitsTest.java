package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringBitsTest {

    public StringBitsTest() {
    }

    @Test
    public void testStringBits() {
        System.out.println("stringBits");
        StringBits instance = new StringBits();
        assertEquals("Hlo", instance.stringBits("Hello"));
        assertEquals("H", instance.stringBits("Hi"));
        assertEquals("Hello", instance.stringBits("Heeololeo"));
        assertEquals("b", instance.stringBits("b"));
        assertEquals("", instance.stringBits(""));
    }

}
