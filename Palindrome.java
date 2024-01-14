import java.util.Scanner;
import java.lang.String;

public class Palindrome {

    public static String Palindrome_Str(String Input) {

        String rev = "";
        int length = Input.length();

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + Input.charAt(i);
        }

        return rev;

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {

            String str = s.nextLine();

            if (str.equals(Palindrome_Str(str))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}