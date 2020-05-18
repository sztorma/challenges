package challenges.codingbat.logic2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CloseFarTest {

    public CloseFarTest() {
    }

    @Test
    public void testCloseFar() {
        System.out.println("closeFar");
        CloseFar instance = new CloseFar();
        assertEquals(true, instance.closeFar(1, 2, 10));
        assertEquals(false, instance.closeFar(1, 2, 3));
        assertEquals(true, instance.closeFar(4, 1, 3));
        assertEquals(true, instance.closeFar(1, 1, 10));
    }

}
