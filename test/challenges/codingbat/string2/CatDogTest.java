package challenges.codingbat.string2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CatDogTest {

    public CatDogTest() {
    }

    @Test
    public void testCatDog() {
        System.out.println("catDog");
        CatDog instance = new CatDog();
        assertEquals(true, instance.catDog("catdog"));
        assertEquals(false, instance.catDog("catcat"));
        assertEquals(true, instance.catDog("1cat1cadodog"));
        assertEquals(true, instance.catDog("abcde"));
        assertEquals(false, instance.catDog("cat"));
        assertEquals(true, instance.catDog("c"));
        assertEquals(true, instance.catDog(""));
        assertEquals(true, instance.catDog(null));
    }

}
