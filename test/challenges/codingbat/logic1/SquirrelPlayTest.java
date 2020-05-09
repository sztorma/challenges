package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquirrelPlayTest {

    public SquirrelPlayTest() {
    }

    @Test
    public void testSquirrelPlay() {
        System.out.println("squirrelPlay");
        SquirrelPlay instance = new SquirrelPlay();
        assertEquals(true, instance.squirrelPlay(70, false));
        assertEquals(false, instance.squirrelPlay(95, false));
        assertEquals(true, instance.squirrelPlay(95, true));

        assertEquals(false, instance.squirrelPlay(59, false));
        assertEquals(true, instance.squirrelPlay(60, false));

        assertEquals(true, instance.squirrelPlay(90, false));
        assertEquals(false, instance.squirrelPlay(91, false));

        assertEquals(true, instance.squirrelPlay(100, true));
        assertEquals(false, instance.squirrelPlay(101, true));

        assertEquals(false, instance.squirrelPlay(50, false));
        assertEquals(false, instance.squirrelPlay(50, true));
        assertEquals(true, instance.squirrelPlay(70, true));
        assertEquals(false, instance.squirrelPlay(101, true));
        assertEquals(false, instance.squirrelPlay(101, false));
    }

}
