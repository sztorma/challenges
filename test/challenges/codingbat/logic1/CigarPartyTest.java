package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class CigarPartyTest {

    public CigarPartyTest() {
    }

    @Test
    public void testCigarParty() {
        System.out.println("cigarParty");
        CigarParty instance = new CigarParty();
        assertEquals(false, instance.cigarParty(30, false));
        assertEquals(true, instance.cigarParty(50, false));
        assertEquals(true, instance.cigarParty(70, true));
        assertEquals(false, instance.cigarParty(30, true));
        assertEquals(true, instance.cigarParty(50, true));
        assertEquals(false, instance.cigarParty(70, false));
    }

}
