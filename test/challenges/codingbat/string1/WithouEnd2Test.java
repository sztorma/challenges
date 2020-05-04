package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class WithouEnd2Test {

    public WithouEnd2Test() {
    }

    @Test
    public void testWithouEnd2() {
        System.out.println("withouEnd2");
        WithouEnd2 instance = new WithouEnd2();
        assertEquals("ell", instance.withouEnd2("Hello"));
        assertEquals("b", instance.withouEnd2("abc"));
        assertEquals("", instance.withouEnd2("ab"));
        assertEquals("", instance.withouEnd2("a"));
        assertEquals("", instance.withouEnd2(""));
    }

}
