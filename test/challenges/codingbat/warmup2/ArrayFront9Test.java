package challenges.codingbat.warmup2;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayFront9Test {

    public ArrayFront9Test() {
    }

    @Test
    public void testArrayFront9() {
        System.out.println("arrayFront9");
        ArrayFront9 instance = new ArrayFront9();
        assertEquals(true, instance.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        assertEquals(false, instance.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        assertEquals(false, instance.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        assertEquals(false, instance.arrayFront9(new int[]{1}));
        assertEquals(true, instance.arrayFront9(new int[]{9}));
        assertEquals(true, instance.arrayFront9(new int[]{1, 2, 3, 9}));
    }

}
