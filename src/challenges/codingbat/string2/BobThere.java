package challenges.codingbat.string2;

/*
Return true if the given string contains a "bob" string, 
but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
 */
public class BobThere {

    public boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }

}
