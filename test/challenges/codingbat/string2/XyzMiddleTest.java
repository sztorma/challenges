package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class XyzMiddleTest {

    @Test
    public void testXyzMiddleTest() {
        XyzMiddle instance = new XyzMiddle();
        assertEquals(true, instance.xyzMiddle("AAxyzBB"));
        assertEquals(true, instance.xyzMiddle("AxyzBB"));
        assertEquals(false, instance.xyzMiddle("AxyzBBB"));
        assertEquals(false, instance.xyzMiddle("Ax"));
        assertEquals(true, instance.xyzMiddle("xyz"));
        assertEquals(true, instance.xyzMiddle("aaxyza"));
        assertEquals(false, instance.xyzMiddle("aaaxyza"));
    }
}
