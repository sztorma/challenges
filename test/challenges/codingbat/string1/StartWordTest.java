package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StartWordTest {

    public StartWordTest() {
    }

    @Test
    public void testStartWord() {
        System.out.println("startWord");
        StartWord instance = new StartWord();
        assertEquals("hi", instance.startWord("hippo", "hi"));
        assertEquals("hip", instance.startWord("hippo", "xip"));
        assertEquals("h", instance.startWord("hippo", "i"));
        assertEquals("", instance.startWord("hippo", "cal"));
        assertEquals("", instance.startWord("", "cal"));
        assertEquals("", instance.startWord("pga", "cal"));
        assertEquals("val", instance.startWord("val", "cal"));
        assertEquals("", instance.startWord("pgaa", "cal"));
    }

}
