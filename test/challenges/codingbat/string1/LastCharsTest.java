package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LastCharsTest {

    public LastCharsTest() {
    }

    @Test
    public void testLastChars() {
        System.out.println("lastChars");
        LastChars instance = new LastChars();
        assertEquals("ls", instance.lastChars("last", "chars"));
        assertEquals("ya", instance.lastChars("yo", "java"));
        assertEquals("h@", instance.lastChars("hi", ""));
        assertEquals("@i", instance.lastChars("", "hi"));
        assertEquals("@@", instance.lastChars("", ""));
        assertEquals("ab", instance.lastChars("a", "b"));
    }

}
