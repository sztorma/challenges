package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class BobThereTest {

    public BobThereTest() {
    }

    @Test
    public void testBobThere() {
        System.out.println("bobThere");
        BobThere instance = new BobThere();
        assertEquals(true, instance.bobThere("abcbob"));
        assertEquals(true, instance.bobThere("b9b"));
        assertEquals(false, instance.bobThere("bac"));
        assertEquals(false, instance.bobThere(""));
        assertEquals(false, instance.bobThere("b"));
        assertEquals(true, instance.bobThere("bobbacsi"));
        assertEquals(true, instance.bobThere("babbacsi"));
        assertEquals(true, instance.bobThere("abcbrb"));
        assertEquals(true, instance.bobThere("ab9ba"));
        assertEquals(true, instance.bobThere("aboba"));
    }

}
