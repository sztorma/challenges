package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeBricksTest {

    public MakeBricksTest() {
    }

    @Test
    public void testMakeBricks() {
        System.out.println("makeBricks");
        MakeBricks instance = new MakeBricks();
        assertEquals(true, instance.makeBricks(3, 1, 8));
        assertEquals(false, instance.makeBricks(3, 1, 9));
        assertEquals(true, instance.makeBricks(3, 2, 10));
        assertEquals(true, instance.makeBricks(0, 0, 0));
        assertEquals(true, instance.makeBricks(16, 0, 16));
        assertEquals(true, instance.makeBricks(6, 2, 16));
        assertEquals(false, instance.makeBricks(7, 1, 13));
        assertEquals(true, instance.makeBricks(11, 1, 16));
        assertEquals(false, instance.makeBricks(10, 1, 16));
        assertEquals(true, instance.makeBricks(12, 1, 16));
        assertEquals(false, instance.makeBricks(9, 1, 16));
        assertEquals(true, instance.makeBricks(15, 1, 20));
        assertEquals(true, instance.makeBricks(20, 0, 20));
        assertEquals(true, instance.makeBricks(0, 4, 20));
        assertEquals(true, instance.makeBricks(100, 400, 20));
        assertEquals(false, instance.makeBricks(40, 1, 46));
    }

}
