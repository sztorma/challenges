package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class RepeatEndTest {

    public RepeatEndTest() {
    }

    @Test
    public void testRepeatEnd() {
        System.out.println("repeatEnd");
        RepeatEnd instance = new RepeatEnd();
        assertEquals("llollollo", instance.repeatEnd("Hello", 3));
        assertEquals("lolo", instance.repeatEnd("Hello", 2));
        assertEquals("o", instance.repeatEnd("Hello", 1));
        assertEquals("", instance.repeatEnd("Hello", 0));
        assertEquals("", instance.repeatEnd("", 0));
    }

}
