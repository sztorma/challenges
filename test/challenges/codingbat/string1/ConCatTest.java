package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConCatTest {

    public ConCatTest() {
    }

    @Test
    public void testConCat() {
        System.out.println("conCat");
        ConCat instance = new ConCat();
        assertEquals("abcat", instance.conCat("abc", "cat"));
        assertEquals("dogcat", instance.conCat("dog", "cat"));
        assertEquals("abc", instance.conCat("abc", ""));
        assertEquals("cba", instance.conCat("", "cba"));
        assertEquals("", instance.conCat("", ""));
    }

}
