package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExtraFrontTest {

    public ExtraFrontTest() {
    }

    @Test
    public void testExtraFront() {
        System.out.println("extraFront");
        ExtraFront instance = new ExtraFront();
        assertEquals("HeHeHe", instance.extraFront("Hello"));
        assertEquals("ababab", instance.extraFront("ab"));
        assertEquals("HHH", instance.extraFront("H"));
        assertEquals("", instance.extraFront(""));
    }

}
