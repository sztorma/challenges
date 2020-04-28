package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class FrontTimesTest {

    public FrontTimesTest() {
    }

    @Test
    public void testFrontTimes() {
        System.out.println("frontTimes");
        FrontTimes instance = new FrontTimes();
        assertEquals("ChoCho", instance.frontTimes("Chocolate", 2));
        assertEquals("ChoChoCho", instance.frontTimes("Chocolate", 3));
        assertEquals("AbcAbcAbc", instance.frontTimes("Abc", 3));
        assertEquals("pipipi", instance.frontTimes("pi", 3));
        assertEquals("", instance.frontTimes("pia", 0));
        assertEquals("", instance.frontTimes("", 50));
    }

}
