package challenges.codingbat.warmup1;

/*
Return true if the given string contains between 1 and 3 'e' chars.

stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
public class StringE {

    public boolean stringE(String str) {
        int counter = 0;
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                counter++;
            }
            if (counter > 3) {
                return false;
            }
        }
        return counter >= 1 && counter <= 3;
    }
}
