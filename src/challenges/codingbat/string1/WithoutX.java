package challenges.codingbat.string1;

/*
Given a string, if the first or last chars are 'x', 
return the string without those 'x' chars, 
and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
*****
 */
public class WithoutX {

    public String withoutX(String str) {
        if (str.length() < 1 || str.equals("x")) {
            return "";
        }
        int start = str.charAt(0) == 'x' ? 1 : 0;
        int end = str.charAt(str.length() - 1) == 'x' ? str.length() - 1 : str.length();
        return str.substring(start, end);
    }
}
