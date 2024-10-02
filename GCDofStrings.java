public class GCDofStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println("\n1071. Greatest Common Divisor of Strings\n");
        GCDofStrings solution = new GCDofStrings();

        System.out.println("Example 1");
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println("Input: str1 = " + str1 + ", str2 = " + str2);
        System.out.println("Output: " + solution.gcdOfStrings(str1, str2));

        System.out.println("\nExample 2");
        String str3 = "ABABAB";
        String str4 = "ABAB";
        System.out.println("Input: str1 = " + str3 + ", str2 = " + str4);
        System.out.println("Output: " + solution.gcdOfStrings(str3, str4));

        System.out.println("\nExample 2");
        String str5 = "LEET";
        String str6 = "CODE";
        System.out.println("Input: str1 = " + str5 + ", str2 = " + str6);
        System.out.println("Output: " + solution.gcdOfStrings(str5, str6));
    }
}
