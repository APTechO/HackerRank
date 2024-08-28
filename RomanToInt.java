import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        // create hash map to hold values
        HashMap<Character, Integer> romanNuMap = new HashMap<>();
        romanNuMap.put('I', 1);
        romanNuMap.put('V', 5);
        romanNuMap.put('X', 10);
        romanNuMap.put('L', 50);
        romanNuMap.put('C', 100);
        romanNuMap.put('D', 500);
        romanNuMap.put('M', 1000);

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // If the current value is less than the next value,
            // subtract current from next and add to sum
            if (i + 1 < s.length() && romanNuMap.get(s.charAt(i)) < romanNuMap.get(s.charAt(i+1))){
                sum += romanNuMap.get(s.charAt(i+1)) - romanNuMap.get(s.charAt(i));
                // skip the next symbol
                i++;
            } else {
                // otherwise, add the current value to sum
                sum += romanNuMap.get(s.charAt(i));
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        String s = "III";
        System.out.println("Roman Numeral: " + s);
        RomanToInt solution = new RomanToInt();
        System.out.println("Integer Value: " + solution.romanToInt(s));
    }
}
