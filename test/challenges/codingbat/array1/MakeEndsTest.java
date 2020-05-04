package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class MakeEndsTest {

    public MakeEndsTest() {
    }

    @Test
    public void testMakeEnds() {
        System.out.println("makeEnds");
        MakeEnds instance = new MakeEnds();
        assertArrayEquals(new int[]{1, 3}, instance.makeEnds(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{1, 4}, instance.makeEnds(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{7, 2}, instance.makeEnds(new int[]{7, 4, 6, 2}));
        assertArrayEquals(new int[]{7, 2}, instance.makeEnds(new int[]{7, 2}));
    }

}
