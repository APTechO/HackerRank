import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a string: ");
        String s = scan.nextLine();
        scan.close();
        
        if(s.trim().length() != 0) {
            String[] tokens = s.trim().split("[ !,?._'@]+");
            System.out.println(tokens.length);
            for(String t : tokens) {
                System.out.println(t);
            }
        } else {
            System.out.println(0);
        }
    }
}