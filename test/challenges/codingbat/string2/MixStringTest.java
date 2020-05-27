package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MixStringTest {

    public MixStringTest() {
    }

    @Test
    public void testMixString() {
        System.out.println("mixString");
        MixString instance = new MixString();
        assertEquals("axbycz", instance.mixString("abc", "xyz"));
        assertEquals("HTihere", instance.mixString("Hi", "There"));
        assertEquals("THhiere", instance.mixString("There", "Hi"));
        assertEquals("There", instance.mixString("There", ""));
        assertEquals("There", instance.mixString("", "There"));
        assertEquals("", instance.mixString("", ""));
        assertEquals("aa", instance.mixString("a", "a"));
    }

}
