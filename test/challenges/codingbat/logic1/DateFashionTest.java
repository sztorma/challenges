package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class DateFashionTest {

    public DateFashionTest() {
    }

    @Test
    public void testDateFashion() {
        System.out.println("dateFashion");
        DateFashion instance = new DateFashion();
        assertEquals(2, instance.dateFashion(5, 10));
        assertEquals(0, instance.dateFashion(5, 2));
        assertEquals(1, instance.dateFashion(5, 5));
        assertEquals(2, instance.dateFashion(5, 8));
        assertEquals(2, instance.dateFashion(8, 5));
        assertEquals(0, instance.dateFashion(2, 5));
        assertEquals(1, instance.dateFashion(3, 7));
        assertEquals(1, instance.dateFashion(7, 3));
    }

}
