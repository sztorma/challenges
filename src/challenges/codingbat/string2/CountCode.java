package challenges.codingbat.string2;

/*
Return the number of times that the string "code" 
appears anywhere in the given string, 
except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
 */
public class CountCode {

    public int countCode(String str) {
        if (str == null || str.length() < 4) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            String part = str.substring(i, i + 4);
            if (part.matches("co.e")) {
                count++;
            }
        }
        return count;
    }

}
