package challenges.codingbat.array1;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlusTwoTest {

    public PlusTwoTest() {
    }

    @Test
    public void testPlusTwo() {
        System.out.println("plusTwo");
        PlusTwo instance = new PlusTwo();
        assertArrayEquals(new int[]{1, 2, 3, 4}, instance.plusTwo(new int[]{1, 2}, new int[]{3, 4}));
        assertArrayEquals(new int[]{4, 4, 2, 2}, instance.plusTwo(new int[]{4, 4}, new int[]{2, 2}));
        assertArrayEquals(new int[]{9, 2, 3, 4}, instance.plusTwo(new int[]{9, 2}, new int[]{3, 4}));
    }

}
