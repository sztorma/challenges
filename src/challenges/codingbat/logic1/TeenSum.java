package challenges.codingbat.logic1;

/*
Given 2 ints, a and b, return their sum. 
However, "teen" values in the range 13..19 inclusive, are extra lucky. 
So if either value is a teen, just return 19.

teenSum(3, 4) → 7
teenSum(10, 13) → 19
teenSum(13, 2) → 19
 */
public class TeenSum {

    public int teenSum(int a, int b) {
        int result = 19;
        if (!isTeen(a) && !isTeen(b)) {
            result = a + b;
        }
        return result;
    }

    private boolean isTeen(int num) {
        return 13 <= num && num <= 19;
    }
}
