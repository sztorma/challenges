package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AtFirstTest {

    public AtFirstTest() {
    }

    @Test
    public void testAtFirst() {
        System.out.println("atFirst");
        AtFirst instance = new AtFirst();
        assertEquals("he", instance.atFirst("hello"));
        assertEquals("hi", instance.atFirst("hi"));
        assertEquals("h@", instance.atFirst("h"));
        assertEquals("@@", instance.atFirst(""));
    }

}
