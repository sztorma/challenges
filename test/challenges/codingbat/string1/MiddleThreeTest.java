package challenges.codingbat.string1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MiddleThreeTest {

    public MiddleThreeTest() {
    }

    @Test
    public void testMiddleThree() {
        System.out.println("middleThree");
        MiddleThree instance = new MiddleThree();
        assertEquals("and", instance.middleThree("Candy"));
        assertEquals("and", instance.middleThree("and"));
        assertEquals("lvi", instance.middleThree("solving"));
    }

}
