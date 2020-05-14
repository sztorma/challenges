package challenges.codingbat.logic1;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzString2Test {

    public FizzString2Test() {
    }

    @Test
    public void testFizzString2() {
        System.out.println("fizzString2");
        FizzString2 instance = new FizzString2();
        assertEquals("1!", instance.fizzString2(1));
        assertEquals("2!", instance.fizzString2(2));
        assertEquals("Fizz!", instance.fizzString2(3));
        assertEquals("Buzz!", instance.fizzString2(10));
        assertEquals("FizzBuzz!", instance.fizzString2(45));
        assertEquals("FizzBuzz!", instance.fizzString2(0));
    }

}
