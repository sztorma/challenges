package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class EndOtherTest {

    public EndOtherTest() {
    }

    @Test
    public void testEndOther() {
        System.out.println("endOther");
        EndOther instance = new EndOther();
        assertEquals(true, instance.endOther("Hiabc", "abc"));
        assertEquals(true, instance.endOther("AbC", "HiaBc"));
        assertEquals(true, instance.endOther("abc", "abXabc"));
        assertEquals(true, instance.endOther("a", "a"));
        assertEquals(true, instance.endOther("a", "A"));
        assertEquals(true, instance.endOther("a", ""));
        assertEquals(true, instance.endOther("", "A"));
        assertEquals(false, instance.endOther("a", "ab"));
        assertEquals(false, instance.endOther("ab", "a"));
        assertEquals(true, instance.endOther("", "ab"));
        assertEquals(true, instance.endOther("", ""));
    }

}
