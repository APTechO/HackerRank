import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
          	//Write your code
            for (int i = 1; i <= testCases; i++) {
                String pattern = in.nextLine();
                try {
                    Pattern.compile(pattern);
                    System.out.println("Valid");
                } catch(Exception E) {
                    System.out.println("Invalid");
                }
                testCases--;
            }
		}
        in.close();
	}
}
