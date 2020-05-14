package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TwoAsOneTest {

    public TwoAsOneTest() {
    }

    @Test
    public void testTwoAsOne() {
        System.out.println("twoAsOne");
        TwoAsOne instance = new TwoAsOne();
        assertEquals(true, instance.twoAsOne(1, 2, 3));
        assertEquals(true, instance.twoAsOne(3, 1, 2));
        assertEquals(false, instance.twoAsOne(3, 2, 2));
        assertEquals(true, instance.twoAsOne(1, 3, 2));
    }

}
