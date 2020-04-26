
package challenges.codingbat.warmup1;

import org.junit.Test;
import static org.junit.Assert.*;


public class DelDelTest {

    @Test
    public void testDelDel() {
        System.out.println("delDel");
        DelDel instance = new DelDel();
        assertEquals("abc", instance.delDel("adelbc"));
        assertEquals("aHello", instance.delDel("adelHello"));
        assertEquals("adebc", instance.delDel("adebc"));
        assertEquals("", instance.delDel(""));
        assertEquals("a", instance.delDel("a"));
        assertEquals("ad", instance.delDel("ad"));
        assertEquals("ade", instance.delDel("ade"));
        assertEquals("a", instance.delDel("adel"));
    }
    
}
