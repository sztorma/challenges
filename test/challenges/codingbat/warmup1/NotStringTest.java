package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class NotStringTest {

    @Test
    public void testNotString() {
        System.out.println("notString");
        NotString instance = new NotString();
        assertEquals("not candy", instance.notString("candy"));
        assertEquals("not x", instance.notString("x"));
        assertEquals("not bad", instance.notString("not bad"));
        assertEquals("not no", instance.notString("no"));
        assertEquals("not ", instance.notString(""));
    }

}
