package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FirstTwoTest {

    public FirstTwoTest() {
    }

    @Test
    public void testFirstTwo() {
        System.out.println("firstTwo");
        FirstTwo instance = new FirstTwo();
        assertEquals("He", instance.firstTwo("Hello"));
        assertEquals("ab", instance.firstTwo("abcdefg"));
        assertEquals("ab", instance.firstTwo("ab"));
        assertEquals("a", instance.firstTwo("a"));
        assertEquals("", instance.firstTwo(""));
    }

}
