package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LessBy10Test {

    public LessBy10Test() {
    }

    @Test
    public void testLessBy10() {
        System.out.println("lessBy10");
        LessBy10 instance = new LessBy10();
        assertEquals(true, instance.lessBy10(1, 7, 11));
        assertEquals(false, instance.lessBy10(1, 7, 10));
        assertEquals(true, instance.lessBy10(11, 1, 7));
        assertEquals(true, instance.lessBy10(7, 11, 1));
    }

}
