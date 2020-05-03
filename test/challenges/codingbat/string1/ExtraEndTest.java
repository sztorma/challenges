package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExtraEndTest {

    public ExtraEndTest() {
    }

    @Test
    public void testExtraEnd() {
        System.out.println("extraEnd");
        ExtraEnd instance = new ExtraEnd();
        assertEquals("lololo", instance.extraEnd("Hello"));
        assertEquals("ababab", instance.extraEnd("ab"));
        assertEquals("HiHiHi", instance.extraEnd("Hi"));
    }

}
