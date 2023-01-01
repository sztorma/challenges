package challenges.codingbat.string2;

/*
 * Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
 * Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
 * 
 * oneTwo("abc") → "bca"
 * oneTwo("tca") → "cat"
 * oneTwo("tcagdo") → "catdog"
 */

public class OneTwo {

    public String oneTwo(String str) {

        if (str == null || str.length() < 3) {
            return "";
        }

        final int lastIndexOfLastGroup = str.length() / 3 * 3;
        final StringBuilder result = new StringBuilder();
        char charToMove = 0;

        for (int i = 0; i < lastIndexOfLastGroup; i++) {
            if (i % 3 == 0) {
                charToMove = str.charAt(i);
            }
            if (i % 3 == 1 || i % 3 == 2) {
                result.append(str.charAt(i));
            }
            if (i % 3 == 2) {
                result.append(charToMove);
            }
        }
        return result.toString();

    }

}
