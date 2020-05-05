package challenges.codingbat.string1;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, 
such as with "badxxx" or "xbadxx" but not "xxbadxx". 
The string may be any length, including 0. 
Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
public class HasBad {

    public boolean hasBad(String str) {
        boolean result = false;
        if (str.length() >= 3) {
            result = str.substring(0, 3).equals("bad");
        }
        if (str.length() > 3) {
            result = result || str.substring(1, 4).equals("bad");
        }
        return result;
    }
}
