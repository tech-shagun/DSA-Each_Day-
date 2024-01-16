import java.util.Scanner;

public class Fact_recursive {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();

            System.out.println(factorial(n));
        }
    }

}
