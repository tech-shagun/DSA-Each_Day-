import java.util.Scanner;
import java.lang.String;

public class String_Rev {
    public static String Str_reverse(String str) {
        int length = str.length();
        String rev = " ";

        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        return rev;

    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            String str = s.nextLine();

            System.out.println(Str_reverse(str));
        }

    }
}
