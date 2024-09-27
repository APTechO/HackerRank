public class ReverseInteger {
    public int reverse(int x) {
        int number = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();

        try {
            number = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return isNegative ? -number : number;
    }

    public static void main(String[] args) {
        System.out.println("\n7. Reverse Integer\n");
        ReverseInteger solution = new ReverseInteger();

        System.out.println("Example 1: ");
        int num1 = 123;
        System.out.println("Input: " + num1);
        System.out.println("Output: " + solution.reverse(num1) + "\n");

        System.out.println("Example 2: ");
        int num2 = -123;
        System.out.println("Input: " + num2);
        System.out.println("Output: " + solution.reverse(num2) + "\n");

        System.out.println("Example 3: ");
        int num3 = 120;
        System.out.println("Input: " + num3);
        System.out.println("Output: " + solution.reverse(num3) + "\n");
    }
    
}
