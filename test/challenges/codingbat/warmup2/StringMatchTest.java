package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringMatchTest {

    public StringMatchTest() {
    }

    @Test
    public void testStringMatch() {
        System.out.println("stringMatch");
        StringMatch instance = new StringMatch();
        assertEquals(3, instance.stringMatch("xxcaazz", "xxbaaz"));
        assertEquals(2, instance.stringMatch("abc", "abc"));
        assertEquals(0, instance.stringMatch("abc", "acx"));
        assertEquals(0, instance.stringMatch("abc", "acxc"));
        assertEquals(0, instance.stringMatch("a", "acx"));
        assertEquals(1, instance.stringMatch("qwerok", "rewqok"));
        assertEquals(0, instance.stringMatch("qwerasdfok", "fdsaok"));
    }

}
