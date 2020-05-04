package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class WithoutEndTest {

    public WithoutEndTest() {
    }

    @Test
    public void testWithoutEnd() {
        System.out.println("withoutEnd");
        WithoutEnd instance = new WithoutEnd();
        assertEquals("ell", instance.withoutEnd("Hello"));
        assertEquals("av", instance.withoutEnd("java"));
        assertEquals("odin", instance.withoutEnd("coding"));
        assertEquals("", instance.withoutEnd("av"));
    }

}
