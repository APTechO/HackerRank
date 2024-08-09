public class MergeAlternately {

    static String merge(String word1, String word2) {

        StringBuilder result = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        int maxLength = Math.max(length1, length2);

        for(int i = 0; i  < maxLength; i++) {
            if(i < length1) {
                result.append(word1.charAt(i));
            }
            if(i < length2) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
    public static void main(String[] args) {

        String word1 = "ac";
        String word2 = "b";

        String result = merge(word1, word2);
        System.out.println(result);

        String word3 = "apple";
        String word4 = "banana";
        String result2 = merge(word3, word4);
        System.out.println(result2);
    }
}