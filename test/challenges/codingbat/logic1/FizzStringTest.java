package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzStringTest {

    public FizzStringTest() {
    }

    @Test
    public void testFizzString() {
        System.out.println("fizzString");
        FizzString instance = new FizzString();
        assertEquals("Fizz", instance.fizzString("fig"));
        assertEquals("Buzz", instance.fizzString("dib"));
        assertEquals("FizzBuzz", instance.fizzString("fib"));
        assertEquals("Fizz", instance.fizzString("fi"));
        assertEquals("FizzBuzz", instance.fizzString("fb"));
        assertEquals("Fizz", instance.fizzString("f"));
        assertEquals("Buzz", instance.fizzString("b"));
        assertEquals("", instance.fizzString(""));
    }

}
