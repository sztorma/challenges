package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;

public class StartOzTest {

    @Test
    public void testStartOz() {
        System.out.println("startOz");
        StartOz instance = new StartOz();
        assertEquals("oz", instance.startOz("ozymandias"));
        assertEquals("z", instance.startOz("bzoo"));
        assertEquals("o", instance.startOz("oxx"));
        assertEquals("", instance.startOz("Oxx"));
        assertEquals("", instance.startOz("zokni"));
        assertEquals("o", instance.startOz("o"));
        assertEquals("", instance.startOz(""));
        assertEquals("", instance.startOz("abc"));
    }

}
