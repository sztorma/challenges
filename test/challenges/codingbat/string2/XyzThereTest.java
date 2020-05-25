package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class XyzThereTest {

    public XyzThereTest() {
    }

    @Test
    public void testXyzThere() {
        System.out.println("xyzThere");
        XyzThere instance = new XyzThere();
        assertEquals(true, instance.xyzThere("abcxyz"));
        assertEquals(false, instance.xyzThere("abc.xyz"));
        assertEquals(true, instance.xyzThere("xyz.abc"));
        assertEquals(true, instance.xyzThere("abcxyzcba"));
        assertEquals(false, instance.xyzThere("fdsasf.xyzFeafdaef"));
        assertEquals(true, instance.xyzThere("abc.xyzxyz"));
    }

}
