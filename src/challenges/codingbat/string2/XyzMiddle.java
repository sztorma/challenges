package challenges.codingbat.string2;

/*
Given a string, does "xyz" appear in the middle of the string? To define middle,
we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
*/

public class XyzMiddle {

    public boolean xyzMiddle(String str) {
        // validation
        if (str.length() < 3) {
            return false;
        }

        // odd number
        if (str.length() % 2 == 1) {
            return isXyzInMiddleEven(str);
        }

        // even number text test adding char to the beginning
        if (isXyzInMiddleEven("l".concat(str))) {
            return true;
        }

        // even number text test adding char to the end
        return isXyzInMiddleEven(str + "r");
    }

    private boolean isXyzInMiddleEven(String str) {
        int border = (str.length() - 3) / 2;
        return str.matches(".{" + border + "}xyz.{" + border + "}");
    }
}
