import java.util.HashMap;
import java.util.Set;

public class Anagrams {

    static boolean isAnagram(String a, String b) {

        // If strings are not the same length
        // Strings are not anagrams
        if (a.length() != b.length()) {
            return false;
        }

        // Create hash map to count frequency of characters
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through first string
        for (int i = 0; i < a.length(); i++) {
            // check is character already in map
            // if so, add 1 to frequency
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i))+1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }

        // Iterate through second string 
        for (int i = 0; i < b.length(); i++) {
            // check if character is in map
            // if so, decrement frequency by 1
            if (map.containsKey(b.charAt(i))) {
                map.put(b.charAt(i), map.get(b.charAt(i)) -1);
            }
        }

        // Extract character keys from hash map
        Set<Character> keys = map.keySet();

        // Loop over all keys, if key is not 0
        // Then strings are not anagrams
        for(Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }


        return true;
    }

    public static void main(String args[]) {
        // System.out.println("Hello");
        String a = "anagram";
        String b = "margana";

        boolean ret = isAnagram(a,b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

        String c = "bob";
        String d = "cat";
        boolean ret2 = isAnagram(c, d);
        System.out.println( (ret2) ? "Anagrams" : "Not Anagrams");
    }
}