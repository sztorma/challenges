package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SeeColorTest {

    public SeeColorTest() {
    }

    @Test
    public void testSeeColor() {
        System.out.println("seeColor");
        SeeColor instance = new SeeColor();
        assertEquals("red", instance.seeColor("redxx"));
        assertEquals("", instance.seeColor("xxred"));
        assertEquals("blue", instance.seeColor("blueTimes"));
        assertEquals("", instance.seeColor("blu"));
        assertEquals("", instance.seeColor("r"));
        assertEquals("", instance.seeColor(""));
    }

}
