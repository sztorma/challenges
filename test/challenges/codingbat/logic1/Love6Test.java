package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class Love6Test {

    public Love6Test() {
    }

    @Test
    public void testLove6() {
        System.out.println("love6");
        Love6 instance = new Love6();
        assertEquals(true, instance.love6(6, 4));
        assertEquals(false, instance.love6(4, 5));
        assertEquals(true, instance.love6(1, 5));
        assertEquals(true, instance.love6(4, 6));
        assertEquals(true, instance.love6(5, 1));
        assertEquals(true, instance.love6(10, 4));
        assertEquals(true, instance.love6(4, 10));
    }

}
