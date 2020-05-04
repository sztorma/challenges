package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TheEndTest {

    public TheEndTest() {
    }

    @Test
    public void testTheEnd() {
        System.out.println("theEnd");
        TheEnd instance = new TheEnd();
        assertEquals("H", instance.theEnd("Hello", true));
        assertEquals("o", instance.theEnd("Hello", false));
        assertEquals("o", instance.theEnd("oh", true));
        assertEquals("r", instance.theEnd("r", true));
        assertEquals("r", instance.theEnd("r", false));
    }

}
