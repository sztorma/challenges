package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class TeaPartyTest {

    public TeaPartyTest() {
    }

    @Test
    public void testTeaParty() {
        System.out.println("teaParty");
        TeaParty instance = new TeaParty();
        assertEquals(1, instance.teaParty(6, 8));
        assertEquals(0, instance.teaParty(3, 8));
        assertEquals(2, instance.teaParty(20, 8));
        assertEquals(2, instance.teaParty(20, 40));
    }

}
