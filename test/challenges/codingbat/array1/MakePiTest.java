package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakePiTest {

    public MakePiTest() {
    }

    @Test
    public void testMakePi() {
        System.out.println("makePi");
        MakePi instance = new MakePi();
        assertArrayEquals(new int[]{3, 1, 4}, instance.makePi());
    }

}
