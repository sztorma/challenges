package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CountHiTest {

    public CountHiTest() {
    }

    @Test
    public void testCountHi() {
        System.out.println("countHi");
        CountHi instance = new CountHi();
        assertEquals(1, instance.countHi("abc hi ho"));
        assertEquals(2, instance.countHi("ABChi hi"));
        assertEquals(2, instance.countHi("hihi"));
        assertEquals(1, instance.countHi("hi"));
        assertEquals(0, instance.countHi("h"));
        assertEquals(0, instance.countHi(""));
        assertEquals(0, instance.countHi("ba"));
        assertEquals(0, instance.countHi(null));
    }

}
