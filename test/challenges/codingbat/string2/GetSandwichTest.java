package challenges.codingbat.string2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GetSandwichTest {

    @Test
    public void testGetSandwich() {
        GetSandwich instance = new GetSandwich();
        assertEquals("", instance.getSandwich(""));
        assertEquals("", instance.getSandwich("1234567890"));
        assertEquals("jam", instance.getSandwich("breadjambread"));
        assertEquals("jam", instance.getSandwich("xxbreadjambreadyy"));
        assertEquals("jam", instance.getSandwich("xxbreadjambread"));
        assertEquals("jam", instance.getSandwich("breadjambreadyy"));
        assertEquals("", instance.getSandwich("xxbreadyy"));
        assertEquals("jambread", instance.getSandwich("xxbreadjambreadbreadyy"));
        assertEquals("jam", instance.getSandwich("breadjambreadbreabrebrebre"));
        assertEquals("jam", instance.getSandwich("breabreabreadjambread"));
    }
}
