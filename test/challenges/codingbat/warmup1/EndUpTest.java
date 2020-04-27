package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EndUpTest {

    @Test
    public void testEndUp() {
        System.out.println("endUp");
        EndUp instance = new EndUp();
        assertEquals("HeLLO", instance.endUp("Hello"));
        assertEquals("hi thERE", instance.endUp("hi there"));
        assertEquals("HI", instance.endUp("hi"));
    }

}
