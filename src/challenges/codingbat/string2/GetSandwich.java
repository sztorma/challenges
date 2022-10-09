package challenges.codingbat.string2;

/*
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string ""
if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
*/

public class GetSandwich {

    public String getSandwich(String str) {

        if (str == null || str.length() <= 10) {
            return "";
        }

        final String bread = "bread";
        int start = -1;
        int end = -1;

        for (int i = 0; i < str.length() - 5; i++) {
            int charAccuracy = charAccuracy(str.substring(i, i + 5), bread);
            if (charAccuracy == 5) {
                start = i + 5;
                break;
            }
            i += charAccuracy;
        }

        for (int i = str.length() - 5; i > -1; i--) {
            int charAccuracy = charAccuracy(str.substring(i, i + 5), bread);
            if (charAccuracy == 5) {
                end = i;
                break;
            }
            i -= charAccuracy;
        }

        if (start > -1 && end > -1) {
            return str.substring(start, end);
        }

        return "";
    }

    private int charAccuracy(String sample, String bread) {
        if (sample.length() != bread.length()) {
            return 0;
        }
        for (int i = 0; i < sample.length(); i++) {
            if (sample.charAt(i) != bread.charAt(i)) {
                return i;
            }
        }
        return bread.length();
    }
}
