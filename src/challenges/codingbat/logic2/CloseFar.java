package challenges.codingbat.logic2;

/*
Given three ints, a b c, return true if one of b or c is "close" 
(differing from a by at most 1), while the other is "far", 
differing from both other values by 2 or more. 
Note: Math.abs(num) computes the absolute value of a number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
 */
public class CloseFar {

    public boolean closeFar(int a, int b, int c) {
        if (isClose(a, b)) {
            return !isClose(a, c) && !isClose(b, c);
        }
        if (isClose(a, c)) {
            return !isClose(b, c) && !isClose(b, a);
        }
        return false;
    }

    private boolean isClose(int a, int b) {
        return Math.abs(a - b) <= 1;
    }
}
